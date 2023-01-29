grammar FP;

program returns [StringBuilder value]: {
     $value = new StringBuilder();
     } (fod=functionOrData { $value.append($fod.value + "\n");})+ EOF;

functionOrData returns [StringBuilder value]:
    fn=function {
        $value = $fn.value;
    }
    | expression {
        $value = new StringBuilder($expression.text);
    };


function returns [StringBuilder value]:
    {
        $value = new StringBuilder();
    }
    (hd=head {
        $value.append($hd.value);
     })
    (bd=body {
        if ($hd.argTypes.size() > 1) {
            $value.append("  ");
            for (int i = $hd.argTypes.size() - 1; i > 0; i--) {
                boolean isNum = true;
                for (int j = 0; j < $bd.argsNames.get(i - 1).length(); j++) {
                    if (($bd.argsNames.get(i - 1).charAt(j) < '0' || $bd.argsNames.get(i - 1).charAt(j) > '9') && $bd.argsNames.get(i - 1).charAt(j) != '.') {
                        isNum = false;
                    }
                }
                boolean isBool = $bd.argsNames.get(i - 1).equals("False") ||  $bd.argsNames.get(i - 1).equals("True");
                if (isNum || isBool) {
                    $bd.argsConiditions.set(i - 1, "a" + ($hd.argTypes.size() - i) + " == " + $bd.argsNames.get(i - 1));
                } else {
                    $value.append($hd.argTypes.get(i) + " " + $bd.argsNames.get(i - 1) + " = a" + ($hd.argTypes.size() - i) + ";\n  ");
                }
            }

            int idXE = $bd.argsConiditions.size() - 1;
            for (int j = $bd.argsConiditions.size() - 1; j >= 0; j--) {
                if (!$bd.argsConiditions.get(j).equals("true")) {
                    idXE = j;
                    break;
                }
            }
            int idXS = 0;
            for (int j = 0; j < $bd.argsConiditions.size(); j++) {
                if (!$bd.argsConiditions.get(j).equals("true")) {
                    idXS = j;
                    break;
                }
            }

            boolean allTrue = true;
            for (int j = 0; j < $bd.argsConiditions.size(); j++) {
                if (!$bd.argsConiditions.get(j).equals("true")) {
                    allTrue = false;
                }
            }


            $value.append("if (");

            if (allTrue != true) {
                for (int j = idXE; j >= idXS; j--) {
                    if (!$bd.argsConiditions.get(j).equals("true"))
                        $value.append("(" + $bd.argsConiditions.get(j) + ")" + (j != idXS ? " && " : " )"));
                }
            } else {
                $value.append("true)");
            }

            $value.append(" {\n    return " + $bd.boo + ";\n  }\n}\n");
        } else {
            $value.append(" return " + $bd.boo + ";\n}\n");
        }
    })+;

head returns [String value, ArrayList<String> argTypes]:
    WORD DOUBLECOLON type {
        $argTypes = $type.value;
        $value = $argTypes.get(0) + ' ' + $WORD.text + "(";
        for (int i = $argTypes.size() - 1; i >= 0; i--) {
            if ($argTypes.size() == 1) {
                $value += ") {\n";
                break;
            }
            $value += $argTypes.get(i) + " a" + ($argTypes.size() - i) + (i == 1 ? ") {\n" : ", ");
            if (i == 1) {
                break;
            }
        }
    };


body returns [String boo, ArrayList<String> argsNames, ArrayList<String> argsConiditions]:
    WORD ad=argsDefinition EQ expression {
    $boo = $expression.text;
    $argsNames = $ad.argsNames;
    $argsConiditions = $ad.argsConiditions;
};

argsDefinition returns [ArrayList<String> argsNames, ArrayList<String> argsConiditions]:
    oneArgument COMMA ad=argsDefinition {
        $argsNames = $ad.argsNames;
        $argsNames.add($oneArgument.argName);
        $argsConiditions = $ad.argsConiditions;
        if ($oneArgument.argCondition != null)
            $argsConiditions.add($oneArgument.argCondition);
    }
    | oneArgument {
        $argsNames = new ArrayList<String>();
        $argsNames.add($oneArgument.argName);
        $argsConiditions = new ArrayList<String>();
        if ($oneArgument.argCondition != null)
            $argsConiditions.add($oneArgument.argCondition);
    }
    | {
        $argsNames = null;
        $argsConiditions = null;
    };

oneArgument returns [String argName, String argCondition] :
    LB oa=oneArgument RB {
     $argName = $oa.argName; $argCondition = $oa.argCondition;
     }
    | WORD STICK condition {
     $argName = $WORD.text; $argCondition = $condition.text;
     }
    | WORD {
     $argName = $WORD.text; $argCondition = "true";
    }
    | data {
     $argName = $data.text; $argCondition = "true";
    };


callFunction : WORD LB ((expr | condition) (COMMA (expr | condition))*)? RB;

type returns [ArrayList<String> value]:
    TYPE {
        $value = new ArrayList<String>();
         if ($TYPE.text.equals("Integer")) {
           $value.add("int");
         } else if ($TYPE.text.equals("Double")) {
           $value.add("double");
         } else if ($TYPE.text.equals("Bool")) {
           $value.add("bool");
         } else {
           $value.add($TYPE.text);
         }
    }
    | TYPE '->' tp=type  {
        $value = $tp.value;
         if ($TYPE.text.equals("Integer")) {
            $value.add("int");
         } else if ($TYPE.text.equals("Double")) {
            $value.add("double");
         } else if ($TYPE.text.equals("Bool")) {
            $value.add("bool");
         } else {
            $value.add($TYPE.text);
         }
    };

data : INTEGER | DOUBLE | BOOL | WORD | callFunction;

expression : data EQ expr | expr;

expr :
    data PLUS expr |
    data MINUS expr |
    data DIV expr |
    data MUL expr |
    data MOD expr |
    data;

condition :
    expr LESS condition |
    expr GREATER condition |
    expr AND condition |
    expr OR condition |
    expr DEQ condition |
    expr;

TYPE : 'Integer' | 'Double' | 'Bool';
INTEGER   : '-'?[0-9]+;
DOUBLE  : INTEGER '.' [0-9]*;
BOOL : 'True' | 'False';
WORD : [a-zA-Z] [a-zA-Z0-9]*;

WS : [ \t\r\n]+ -> skip;

COMMA  : ',';
LB     : '(';
RB     : ')';
COLON  : ':';
DOUBLECOLON : '::';
SEMICOLON : ';';
EQ     : '=';
STICK  : '|';
ARROW  : '->';

PLUS  : '+';
MINUS : '-';
DIV   : '/';
MUL   : '*';
MOD   : '%';

OR : '||';
AND : '&&';
LESS : '<';
GREATER : '>';
DEQ : '==';



