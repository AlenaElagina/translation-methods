// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPE=1, INTEGER=2, DOUBLE=3, BOOL=4, WORD=5, WS=6, COMMA=7, LB=8, RB=9, 
		COLON=10, DOUBLECOLON=11, SEMICOLON=12, EQ=13, STICK=14, ARROW=15, PLUS=16, 
		MINUS=17, DIV=18, MUL=19, MOD=20, OR=21, AND=22, LESS=23, GREATER=24, 
		DEQ=25;
	public static final int
		RULE_program = 0, RULE_functionOrData = 1, RULE_function = 2, RULE_head = 3, 
		RULE_body = 4, RULE_argsDefinition = 5, RULE_oneArgument = 6, RULE_callFunction = 7, 
		RULE_type = 8, RULE_data = 9, RULE_expression = 10, RULE_expr = 11, RULE_condition = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "functionOrData", "function", "head", "body", "argsDefinition", 
			"oneArgument", "callFunction", "type", "data", "expression", "expr", 
			"condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "','", "'('", "')'", "':'", 
			"'::'", "';'", "'='", "'|'", "'->'", "'+'", "'-'", "'/'", "'*'", "'%'", 
			"'||'", "'&&'", "'<'", "'>'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TYPE", "INTEGER", "DOUBLE", "BOOL", "WORD", "WS", "COMMA", "LB", 
			"RB", "COLON", "DOUBLECOLON", "SEMICOLON", "EQ", "STICK", "ARROW", "PLUS", 
			"MINUS", "DIV", "MUL", "MOD", "OR", "AND", "LESS", "GREATER", "DEQ"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public StringBuilder value;
		public FunctionOrDataContext fod;
		public TerminalNode EOF() { return getToken(FPParser.EOF, 0); }
		public List<FunctionOrDataContext> functionOrData() {
			return getRuleContexts(FunctionOrDataContext.class);
		}
		public FunctionOrDataContext functionOrData(int i) {
			return getRuleContext(FunctionOrDataContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			     ((ProgramContext)_localctx).value =  new StringBuilder();
			     
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				((ProgramContext)_localctx).fod = functionOrData();
				 _localctx.value.append(((ProgramContext)_localctx).fod.value + "\n");
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0 );
			setState(34);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionOrDataContext extends ParserRuleContext {
		public StringBuilder value;
		public FunctionContext fn;
		public ExpressionContext expression;
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionOrDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterFunctionOrData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitFunctionOrData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitFunctionOrData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionOrDataContext functionOrData() throws RecognitionException {
		FunctionOrDataContext _localctx = new FunctionOrDataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functionOrData);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				((FunctionOrDataContext)_localctx).fn = function();

				        ((FunctionOrDataContext)_localctx).value =  ((FunctionOrDataContext)_localctx).fn.value;
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				((FunctionOrDataContext)_localctx).expression = expression();

				        ((FunctionOrDataContext)_localctx).value =  new StringBuilder((((FunctionOrDataContext)_localctx).expression!=null?_input.getText(((FunctionOrDataContext)_localctx).expression.start,((FunctionOrDataContext)_localctx).expression.stop):null));
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public StringBuilder value;
		public HeadContext hd;
		public BodyContext bd;
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			        ((FunctionContext)_localctx).value =  new StringBuilder();
			    
			{
			setState(45);
			((FunctionContext)_localctx).hd = head();

			        _localctx.value.append(((FunctionContext)_localctx).hd.value);
			     
			}
			setState(51); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(48);
					((FunctionContext)_localctx).bd = body();

					        if (((FunctionContext)_localctx).hd.argTypes.size() > 1) {
					            _localctx.value.append("  ");
					            for (int i = ((FunctionContext)_localctx).hd.argTypes.size() - 1; i > 0; i--) {
					                boolean isNum = true;
					                for (int j = 0; j < ((FunctionContext)_localctx).bd.argsNames.get(i - 1).length(); j++) {
					                    if ((((FunctionContext)_localctx).bd.argsNames.get(i - 1).charAt(j) < '0' || ((FunctionContext)_localctx).bd.argsNames.get(i - 1).charAt(j) > '9') && ((FunctionContext)_localctx).bd.argsNames.get(i - 1).charAt(j) != '.') {
					                        isNum = false;
					                    }
					                }
					                boolean isBool = ((FunctionContext)_localctx).bd.argsNames.get(i - 1).equals("False") ||  ((FunctionContext)_localctx).bd.argsNames.get(i - 1).equals("True");
					                if (isNum || isBool) {
					                    ((FunctionContext)_localctx).bd.argsConiditions.set(i - 1, "a" + (((FunctionContext)_localctx).hd.argTypes.size() - i) + " == " + ((FunctionContext)_localctx).bd.argsNames.get(i - 1));
					                } else {
					                    _localctx.value.append(((FunctionContext)_localctx).hd.argTypes.get(i) + " " + ((FunctionContext)_localctx).bd.argsNames.get(i - 1) + " = a" + (((FunctionContext)_localctx).hd.argTypes.size() - i) + ";\n  ");
					                }
					            }

					            int idXE = ((FunctionContext)_localctx).bd.argsConiditions.size() - 1;
					            for (int j = ((FunctionContext)_localctx).bd.argsConiditions.size() - 1; j >= 0; j--) {
					                if (!((FunctionContext)_localctx).bd.argsConiditions.get(j).equals("true")) {
					                    idXE = j;
					                    break;
					                }
					            }
					            int idXS = 0;
					            for (int j = 0; j < ((FunctionContext)_localctx).bd.argsConiditions.size(); j++) {
					                if (!((FunctionContext)_localctx).bd.argsConiditions.get(j).equals("true")) {
					                    idXS = j;
					                    break;
					                }
					            }

					            boolean allTrue = true;
					            for (int j = 0; j < ((FunctionContext)_localctx).bd.argsConiditions.size(); j++) {
					                if (!((FunctionContext)_localctx).bd.argsConiditions.get(j).equals("true")) {
					                    allTrue = false;
					                }
					            }


					            _localctx.value.append("if (");

					            if (allTrue != true) {
					                for (int j = idXE; j >= idXS; j--) {
					                    if (!((FunctionContext)_localctx).bd.argsConiditions.get(j).equals("true"))
					                        _localctx.value.append("(" + ((FunctionContext)_localctx).bd.argsConiditions.get(j) + ")" + (j != idXS ? " && " : " )"));
					                }
					            } else {
					                _localctx.value.append("true)");
					            }

					            _localctx.value.append(" {\n    return " + ((FunctionContext)_localctx).bd.boo + ";\n  }\n}\n");
					        } else {
					            _localctx.value.append(" return " + ((FunctionContext)_localctx).bd.boo + ";\n}\n");
					        }
					    
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(53); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HeadContext extends ParserRuleContext {
		public String value;
		public ArrayList<String> argTypes;
		public Token WORD;
		public TypeContext type;
		public TerminalNode WORD() { return getToken(FPParser.WORD, 0); }
		public TerminalNode DOUBLECOLON() { return getToken(FPParser.DOUBLECOLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			((HeadContext)_localctx).WORD = match(WORD);
			setState(56);
			match(DOUBLECOLON);
			setState(57);
			((HeadContext)_localctx).type = type();

			        ((HeadContext)_localctx).argTypes =  ((HeadContext)_localctx).type.value;
			        ((HeadContext)_localctx).value =  _localctx.argTypes.get(0) + ' ' + (((HeadContext)_localctx).WORD!=null?((HeadContext)_localctx).WORD.getText():null) + "(";
			        for (int i = _localctx.argTypes.size() - 1; i >= 0; i--) {
			            if (_localctx.argTypes.size() == 1) {
			                _localctx.value += ") {\n";
			                break;
			            }
			            _localctx.value += _localctx.argTypes.get(i) + " a" + (_localctx.argTypes.size() - i) + (i == 1 ? ") {\n" : ", ");
			            if (i == 1) {
			                break;
			            }
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public String boo;
		public ArrayList<String> argsNames;
		public ArrayList<String> argsConiditions;
		public ArgsDefinitionContext ad;
		public ExpressionContext expression;
		public TerminalNode WORD() { return getToken(FPParser.WORD, 0); }
		public TerminalNode EQ() { return getToken(FPParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArgsDefinitionContext argsDefinition() {
			return getRuleContext(ArgsDefinitionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(WORD);
			setState(61);
			((BodyContext)_localctx).ad = argsDefinition();
			setState(62);
			match(EQ);
			setState(63);
			((BodyContext)_localctx).expression = expression();

			    ((BodyContext)_localctx).boo =  (((BodyContext)_localctx).expression!=null?_input.getText(((BodyContext)_localctx).expression.start,((BodyContext)_localctx).expression.stop):null);
			    ((BodyContext)_localctx).argsNames =  ((BodyContext)_localctx).ad.argsNames;
			    ((BodyContext)_localctx).argsConiditions =  ((BodyContext)_localctx).ad.argsConiditions;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsDefinitionContext extends ParserRuleContext {
		public ArrayList<String> argsNames;
		public ArrayList<String> argsConiditions;
		public OneArgumentContext oneArgument;
		public ArgsDefinitionContext ad;
		public OneArgumentContext oneArgument() {
			return getRuleContext(OneArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FPParser.COMMA, 0); }
		public ArgsDefinitionContext argsDefinition() {
			return getRuleContext(ArgsDefinitionContext.class,0);
		}
		public ArgsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterArgsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitArgsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitArgsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsDefinitionContext argsDefinition() throws RecognitionException {
		ArgsDefinitionContext _localctx = new ArgsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argsDefinition);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				((ArgsDefinitionContext)_localctx).oneArgument = oneArgument();
				setState(67);
				match(COMMA);
				setState(68);
				((ArgsDefinitionContext)_localctx).ad = argsDefinition();

				        ((ArgsDefinitionContext)_localctx).argsNames =  ((ArgsDefinitionContext)_localctx).ad.argsNames;
				        _localctx.argsNames.add(((ArgsDefinitionContext)_localctx).oneArgument.argName);
				        ((ArgsDefinitionContext)_localctx).argsConiditions =  ((ArgsDefinitionContext)_localctx).ad.argsConiditions;
				        if (((ArgsDefinitionContext)_localctx).oneArgument.argCondition != null)
				            _localctx.argsConiditions.add(((ArgsDefinitionContext)_localctx).oneArgument.argCondition);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				((ArgsDefinitionContext)_localctx).oneArgument = oneArgument();

				        ((ArgsDefinitionContext)_localctx).argsNames =  new ArrayList<String>();
				        _localctx.argsNames.add(((ArgsDefinitionContext)_localctx).oneArgument.argName);
				        ((ArgsDefinitionContext)_localctx).argsConiditions =  new ArrayList<String>();
				        if (((ArgsDefinitionContext)_localctx).oneArgument.argCondition != null)
				            _localctx.argsConiditions.add(((ArgsDefinitionContext)_localctx).oneArgument.argCondition);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{

				        ((ArgsDefinitionContext)_localctx).argsNames =  null;
				        ((ArgsDefinitionContext)_localctx).argsConiditions =  null;
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OneArgumentContext extends ParserRuleContext {
		public String argName;
		public String argCondition;
		public OneArgumentContext oa;
		public Token WORD;
		public ConditionContext condition;
		public DataContext data;
		public TerminalNode LB() { return getToken(FPParser.LB, 0); }
		public TerminalNode RB() { return getToken(FPParser.RB, 0); }
		public OneArgumentContext oneArgument() {
			return getRuleContext(OneArgumentContext.class,0);
		}
		public TerminalNode WORD() { return getToken(FPParser.WORD, 0); }
		public TerminalNode STICK() { return getToken(FPParser.STICK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public OneArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterOneArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitOneArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitOneArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneArgumentContext oneArgument() throws RecognitionException {
		OneArgumentContext _localctx = new OneArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_oneArgument);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(LB);
				setState(78);
				((OneArgumentContext)_localctx).oa = oneArgument();
				setState(79);
				match(RB);

				     ((OneArgumentContext)_localctx).argName =  ((OneArgumentContext)_localctx).oa.argName; ((OneArgumentContext)_localctx).argCondition =  ((OneArgumentContext)_localctx).oa.argCondition;
				     
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				((OneArgumentContext)_localctx).WORD = match(WORD);
				setState(83);
				match(STICK);
				setState(84);
				((OneArgumentContext)_localctx).condition = condition();

				     ((OneArgumentContext)_localctx).argName =  (((OneArgumentContext)_localctx).WORD!=null?((OneArgumentContext)_localctx).WORD.getText():null); ((OneArgumentContext)_localctx).argCondition =  (((OneArgumentContext)_localctx).condition!=null?_input.getText(((OneArgumentContext)_localctx).condition.start,((OneArgumentContext)_localctx).condition.stop):null);
				     
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((OneArgumentContext)_localctx).WORD = match(WORD);

				     ((OneArgumentContext)_localctx).argName =  (((OneArgumentContext)_localctx).WORD!=null?((OneArgumentContext)_localctx).WORD.getText():null); ((OneArgumentContext)_localctx).argCondition =  "true";
				    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				((OneArgumentContext)_localctx).data = data();

				     ((OneArgumentContext)_localctx).argName =  (((OneArgumentContext)_localctx).data!=null?_input.getText(((OneArgumentContext)_localctx).data.start,((OneArgumentContext)_localctx).data.stop):null); ((OneArgumentContext)_localctx).argCondition =  "true";
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(FPParser.WORD, 0); }
		public TerminalNode LB() { return getToken(FPParser.LB, 0); }
		public TerminalNode RB() { return getToken(FPParser.RB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(FPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(FPParser.COMMA, i);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WORD);
			setState(95);
			match(LB);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 60L) != 0) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(96);
					expr();
					}
					break;
				case 2:
					{
					setState(97);
					condition();
					}
					break;
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(100);
					match(COMMA);
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(101);
						expr();
						}
						break;
					case 2:
						{
						setState(102);
						condition();
						}
						break;
					}
					}
					}
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(112);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ArrayList<String> value;
		public Token TYPE;
		public TypeContext tp;
		public TerminalNode TYPE() { return getToken(FPParser.TYPE, 0); }
		public TerminalNode ARROW() { return getToken(FPParser.ARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((TypeContext)_localctx).TYPE = match(TYPE);

				        ((TypeContext)_localctx).value =  new ArrayList<String>();
				         if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Integer")) {
				           _localctx.value.add("int");
				         } else if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Double")) {
				           _localctx.value.add("double");
				         } else if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Bool")) {
				           _localctx.value.add("bool");
				         } else {
				           _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null));
				         }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				((TypeContext)_localctx).TYPE = match(TYPE);
				setState(117);
				match(ARROW);
				setState(118);
				((TypeContext)_localctx).tp = type();

				        ((TypeContext)_localctx).value =  ((TypeContext)_localctx).tp.value;
				         if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Integer")) {
				            _localctx.value.add("int");
				         } else if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Double")) {
				            _localctx.value.add("double");
				         } else if ((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null).equals("Bool")) {
				            _localctx.value.add("bool");
				         } else {
				            _localctx.value.add((((TypeContext)_localctx).TYPE!=null?((TypeContext)_localctx).TYPE.getText():null));
				         }
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(FPParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(FPParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(FPParser.BOOL, 0); }
		public TerminalNode WORD() { return getToken(FPParser.WORD, 0); }
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_data);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(INTEGER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(DOUBLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(BOOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				match(WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				callFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode EQ() { return getToken(FPParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				data();
				setState(131);
				match(EQ);
				setState(132);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FPParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FPParser.MINUS, 0); }
		public TerminalNode DIV() { return getToken(FPParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(FPParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(FPParser.MOD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				data();
				setState(138);
				match(PLUS);
				setState(139);
				expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				data();
				setState(142);
				match(MINUS);
				setState(143);
				expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				data();
				setState(146);
				match(DIV);
				setState(147);
				expr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				data();
				setState(150);
				match(MUL);
				setState(151);
				expr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				data();
				setState(154);
				match(MOD);
				setState(155);
				expr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				data();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LESS() { return getToken(FPParser.LESS, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(FPParser.GREATER, 0); }
		public TerminalNode AND() { return getToken(FPParser.AND, 0); }
		public TerminalNode OR() { return getToken(FPParser.OR, 0); }
		public TerminalNode DEQ() { return getToken(FPParser.DEQ, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FPListener ) ((FPListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FPVisitor ) return ((FPVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				expr();
				setState(161);
				match(LESS);
				setState(162);
				condition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				expr();
				setState(165);
				match(GREATER);
				setState(166);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				expr();
				setState(169);
				match(AND);
				setState(170);
				condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				expr();
				setState(173);
				match(OR);
				setState(174);
				condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				expr();
				setState(177);
				match(DEQ);
				setState(178);
				condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004"+
		"\u0000\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001+\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0004\u00024\b\u0002\u000b\u0002\f\u0002"+
		"5\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007c\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007h\b\u0007\u0005\u0007j\b\u0007\n\u0007\f\u0007m\t\u0007\u0003"+
		"\u0007o\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bz\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0081\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0088\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009f\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00b6\b\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000"+
		"\u00c6\u0000\u001a\u0001\u0000\u0000\u0000\u0002*\u0001\u0000\u0000\u0000"+
		"\u0004,\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b<\u0001"+
		"\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000\u0000"+
		"\u000e^\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012\u0080"+
		"\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000\u0000\u0000\u0016\u009e"+
		"\u0001\u0000\u0000\u0000\u0018\u00b5\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\u0006\u0000\uffff\uffff\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c"+
		"\u001d\u0006\u0000\uffff\uffff\u0000\u001d\u001f\u0001\u0000\u0000\u0000"+
		"\u001e\u001b\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e"+
		"\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0005\u0000\u0000\u0001#\u0001\u0001\u0000\u0000\u0000$%\u0003"+
		"\u0004\u0002\u0000%&\u0006\u0001\uffff\uffff\u0000&+\u0001\u0000\u0000"+
		"\u0000\'(\u0003\u0014\n\u0000()\u0006\u0001\uffff\uffff\u0000)+\u0001"+
		"\u0000\u0000\u0000*$\u0001\u0000\u0000\u0000*\'\u0001\u0000\u0000\u0000"+
		"+\u0003\u0001\u0000\u0000\u0000,-\u0006\u0002\uffff\uffff\u0000-.\u0003"+
		"\u0006\u0003\u0000./\u0006\u0002\uffff\uffff\u0000/3\u0001\u0000\u0000"+
		"\u000001\u0003\b\u0004\u000012\u0006\u0002\uffff\uffff\u000024\u0001\u0000"+
		"\u0000\u000030\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u00006\u0005\u0001\u0000\u0000"+
		"\u000078\u0005\u0005\u0000\u000089\u0005\u000b\u0000\u00009:\u0003\u0010"+
		"\b\u0000:;\u0006\u0003\uffff\uffff\u0000;\u0007\u0001\u0000\u0000\u0000"+
		"<=\u0005\u0005\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005\r\u0000\u0000"+
		"?@\u0003\u0014\n\u0000@A\u0006\u0004\uffff\uffff\u0000A\t\u0001\u0000"+
		"\u0000\u0000BC\u0003\f\u0006\u0000CD\u0005\u0007\u0000\u0000DE\u0003\n"+
		"\u0005\u0000EF\u0006\u0005\uffff\uffff\u0000FL\u0001\u0000\u0000\u0000"+
		"GH\u0003\f\u0006\u0000HI\u0006\u0005\uffff\uffff\u0000IL\u0001\u0000\u0000"+
		"\u0000JL\u0006\u0005\uffff\uffff\u0000KB\u0001\u0000\u0000\u0000KG\u0001"+
		"\u0000\u0000\u0000KJ\u0001\u0000\u0000\u0000L\u000b\u0001\u0000\u0000"+
		"\u0000MN\u0005\b\u0000\u0000NO\u0003\f\u0006\u0000OP\u0005\t\u0000\u0000"+
		"PQ\u0006\u0006\uffff\uffff\u0000Q]\u0001\u0000\u0000\u0000RS\u0005\u0005"+
		"\u0000\u0000ST\u0005\u000e\u0000\u0000TU\u0003\u0018\f\u0000UV\u0006\u0006"+
		"\uffff\uffff\u0000V]\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000\u0000"+
		"X]\u0006\u0006\uffff\uffff\u0000YZ\u0003\u0012\t\u0000Z[\u0006\u0006\uffff"+
		"\uffff\u0000[]\u0001\u0000\u0000\u0000\\M\u0001\u0000\u0000\u0000\\R\u0001"+
		"\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000\\Y\u0001\u0000\u0000\u0000"+
		"]\r\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_n\u0005\b\u0000"+
		"\u0000`c\u0003\u0016\u000b\u0000ac\u0003\u0018\f\u0000b`\u0001\u0000\u0000"+
		"\u0000ba\u0001\u0000\u0000\u0000ck\u0001\u0000\u0000\u0000dg\u0005\u0007"+
		"\u0000\u0000eh\u0003\u0016\u000b\u0000fh\u0003\u0018\f\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000id\u0001"+
		"\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000nb\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0005\t\u0000\u0000q\u000f\u0001\u0000\u0000\u0000rs\u0005"+
		"\u0001\u0000\u0000sz\u0006\b\uffff\uffff\u0000tu\u0005\u0001\u0000\u0000"+
		"uv\u0005\u000f\u0000\u0000vw\u0003\u0010\b\u0000wx\u0006\b\uffff\uffff"+
		"\u0000xz\u0001\u0000\u0000\u0000yr\u0001\u0000\u0000\u0000yt\u0001\u0000"+
		"\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{\u0081\u0005\u0002\u0000\u0000"+
		"|\u0081\u0005\u0003\u0000\u0000}\u0081\u0005\u0004\u0000\u0000~\u0081"+
		"\u0005\u0005\u0000\u0000\u007f\u0081\u0003\u000e\u0007\u0000\u0080{\u0001"+
		"\u0000\u0000\u0000\u0080|\u0001\u0000\u0000\u0000\u0080}\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0013\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0012\t\u0000\u0083"+
		"\u0084\u0005\r\u0000\u0000\u0084\u0085\u0003\u0016\u000b\u0000\u0085\u0088"+
		"\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0016\u000b\u0000\u0087\u0082"+
		"\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0015"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0003\u0012\t\u0000\u008a\u008b\u0005"+
		"\u0010\u0000\u0000\u008b\u008c\u0003\u0016\u000b\u0000\u008c\u009f\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0003\u0012\t\u0000\u008e\u008f\u0005\u0011"+
		"\u0000\u0000\u008f\u0090\u0003\u0016\u000b\u0000\u0090\u009f\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0003\u0012\t\u0000\u0092\u0093\u0005\u0012\u0000"+
		"\u0000\u0093\u0094\u0003\u0016\u000b\u0000\u0094\u009f\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0003\u0012\t\u0000\u0096\u0097\u0005\u0013\u0000\u0000"+
		"\u0097\u0098\u0003\u0016\u000b\u0000\u0098\u009f\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b"+
		"\u009c\u0003\u0016\u000b\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009f\u0003\u0012\t\u0000\u009e\u0089\u0001\u0000\u0000\u0000\u009e\u008d"+
		"\u0001\u0000\u0000\u0000\u009e\u0091\u0001\u0000\u0000\u0000\u009e\u0095"+
		"\u0001\u0000\u0000\u0000\u009e\u0099\u0001\u0000\u0000\u0000\u009e\u009d"+
		"\u0001\u0000\u0000\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0003\u0016\u000b\u0000\u00a1\u00a2\u0005\u0017\u0000\u0000\u00a2\u00a3"+
		"\u0003\u0018\f\u0000\u00a3\u00b6\u0001\u0000\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0016\u000b\u0000\u00a5\u00a6\u0005\u0018\u0000\u0000\u00a6\u00a7\u0003"+
		"\u0018\f\u0000\u00a7\u00b6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0003\u0016"+
		"\u000b\u0000\u00a9\u00aa\u0005\u0016\u0000\u0000\u00aa\u00ab\u0003\u0018"+
		"\f\u0000\u00ab\u00b6\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\u0016\u000b"+
		"\u0000\u00ad\u00ae\u0005\u0015\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000"+
		"\u00af\u00b6\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003\u0016\u000b\u0000"+
		"\u00b1\u00b2\u0005\u0019\u0000\u0000\u00b2\u00b3\u0003\u0018\f\u0000\u00b3"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b6\u0003\u0016\u000b\u0000\u00b5"+
		"\u00a0\u0001\u0000\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000\u00b5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u0019\u0001\u0000\u0000\u0000\u000e *5K\\bgkny\u0080\u0087\u009e\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}