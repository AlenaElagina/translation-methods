#include "pch.h"
#include <iostream>	
#include <fstream>
#include "../lab_2/Util.h"
#include "../lab_2/FirstArray.h"
#include "../lab_2/lexical_analyzer.h"
#include "../lab_2/syntax_analyzer.h"
#include "../lab_2/vizualizer.h"

grammar_type new_grammar = my_grammar();

TEST(FirstArray, FirstArray) {
	std::unordered_map<std::string, std::set<std::string>> fst = First(new_grammar);
	std::unordered_map<std::string, std::set<std::string>> expect;
	expect["E"].insert("eps");
	expect["E"].insert("keyword");
	expect["T"].insert("keyword");
	expect["F"].insert("keyword");
	expect["V"].insert("name");
	expect["P"].insert("type");
	expect["H"].insert("type");
	expect["B"].insert("=");
	expect["B"].insert("eps");
	expect["A"].insert("number");
	expect["Q"].insert("keyword");
    EXPECT_EQ(fst, expect);
}

bool vec_tok_eq(std::vector<token> vec1, std::vector<token> vec2) {
	for (int i = 0; i < vec1.size(); i++) {
		if ((vec1[i].get_token() != vec2[i].get_token()) || (vec1[i].get_value() != vec2[i].get_value())) {
			return false;
		}
	}
	return true;
}

TEST(LexicalAnalyzer, LA1) {
	std::string expression = "var a: Int ;";

	std::vector<token> expect = { token("var", KEYWORD), token("a", VARIABLE), token(":", COLON),
		token("Int", TYPE), token(";", SEMICOLON), token("$", END)};

	EXPECT_TRUE(vec_tok_eq(lexical_analyzer(expression), expect));
}

TEST(LexicalAnalyzer, LA2) {
	std::string expression = "val b   : Int = 5 ;";

	std::vector<token> expect = { token("val", KEYWORD), token("b", VARIABLE), token(":", COLON),
		token("Int", TYPE),token("=", EQUAL), token("5", NUMBER), token(";", SEMICOLON), token("$", END) };

	EXPECT_TRUE(vec_tok_eq(lexical_analyzer(expression), expect));
}

TEST(LexicalAnalyzer, LA3) {
	std::string expression = "var a: Int ;   val b   : Int = 5 ;";

	std::vector<token> expect = { token("var", KEYWORD), token("a", VARIABLE), token(":", COLON),
		token("Int", TYPE), token(";", SEMICOLON), token("val", KEYWORD), token("b", VARIABLE), token(":", COLON),
		token("Int", TYPE),token("=", EQUAL), token("5", NUMBER), token(";", SEMICOLON), token("$", END) };

	EXPECT_TRUE(vec_tok_eq(lexical_analyzer(expression), expect));
}

TEST(LexicalAnalyzer, LA4) {
	std::string expression = "var 5: Int";

	EXPECT_THROW(lexical_analyzer(expression), std::exception);

	try {
		lexical_analyzer(expression);
	} 
	catch (const std::exception& ex) {
		std::string error = ex.what();
		EXPECT_EQ(error, "The KEYWORD should be followed by a VARIABLE");
	}
}

TEST(LexicalAnalyzer, LA5) {
	std::string expression = "Int a = 5;";

	EXPECT_THROW(lexical_analyzer(expression), std::exception);

	try {
		lexical_analyzer(expression);
	}
	catch (const std::exception& ex) {
		std::string error = ex.what();
		EXPECT_EQ(error, "The KEYWORD should be first");
	}
}

TEST(LexicalAnalyzer, LA6) {
	std::string expression = "var a: Int ;   Int d = 5;";

	EXPECT_THROW(lexical_analyzer(expression), std::exception);

	try {
		lexical_analyzer(expression);
	}
	catch (const std::exception& ex) {
		std::string error = ex.what();
		EXPECT_EQ(error, "The SEMICOLON should be followed by a KEYWORD or END");
	}
}

bool tr_eq(Tree tr1, Tree tr2) {
	if (tr1.get_elem() != tr2.get_elem()) {
		return false;
	}

	std::vector<Tree> ch1 = tr1.get_children();
	std::vector<Tree> ch2 = tr2.get_children();
	if (ch1.size() != ch2.size()) {
		return false;
	}
	for (int i = 0; i < ch1.size(); i++) {
		if (!tr_eq(ch1[i], ch2[i])) {
			return false;
		}
	}

	return true;
}



std::string run_file(std::string test_number, std::string tree_file, std::string graphviz_file) {
	return "dot -Tsvg " + tree_file + " > " + graphviz_file;
}

void run(std::string test_number, Tree tr) {
	std::ofstream tree_file;
	std::string tree_filename = "tree" + test_number + ".dot";
	tree_file.open("tree" + test_number + ".dot");
	vizualizer vz(tr, std::move(tree_file));
	vz.to_graphviz(tr);
	tree_file.close();

	std::ofstream run_f;
	run_f.open("run" + test_number + ".bat");
	run_f << run_file(test_number, tree_filename, "graph" + test_number + ".svg");
	run_f.close();

}

TEST(SyntaxAnalyzer, SA1) {
	std::string expression = "val b   : Int = 5 ;";

	Tree tr = parser(expression, new_grammar);

	Tree expect("E", {
		Tree("T", {
			Tree("F", { Tree("Q", {Tree("val")}), Tree("V", {Tree("b")})}),
			Tree(":"),
			Tree("P", { Tree("H", {Tree("Int")}), Tree("B", {Tree("="), Tree("A", {Tree("5")})})})}),
		Tree(";"),
		Tree("E", {Tree("eps")}) });

EXPECT_TRUE(tr_eq(tr, expect));

	run("1", tr);
}

TEST(SyntaxAnalyzer, SA2) {
	std::string expression = "var a: Int ;";

	Tree tr = parser(expression, new_grammar);

	Tree expect("E", {
		Tree("T", {
			Tree("F", { Tree("Q", {Tree("var")}), Tree("V", {Tree("a")})}),
			Tree(":"),
			Tree("P", { Tree("H", {Tree("Int")}), Tree("B", {Tree("eps")})})}),
		Tree(";"),
		Tree("E", {Tree("eps")})});

	EXPECT_TRUE(tr_eq(tr, expect));

	run("2", tr);
}

TEST(SyntaxAnalyzer, SA3) {
	std::string expression = "var a: Int ;   val b   : Int = 5 ;";

	Tree tr = parser(expression, new_grammar);

	Tree expect("E", { 
		Tree("T", { 
			Tree("F", { Tree("Q", {Tree("var")}), Tree("V", {Tree("a")})}),
			Tree(":"), 
			Tree("P", { Tree("H", {Tree("Int")}), Tree("B", {Tree("eps")})})}),
		Tree(";"), 
		Tree("E", { 
			Tree("T", {
				Tree("F", { Tree("Q", {Tree("val")}), Tree("V", {Tree("b")})}),
				Tree(":"),
				Tree("P", { Tree("H", {Tree("Int")}), Tree("B", {Tree("="), Tree("A", {Tree("5")})})})}),
			Tree(";"), 
			Tree("E", {Tree("eps")})})});

	EXPECT_TRUE(tr_eq(tr, expect));

	run("3", tr);
}