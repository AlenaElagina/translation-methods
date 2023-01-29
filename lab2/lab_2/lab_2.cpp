#include <unordered_map>
#include <vector>
#include <fstream>
#include "Util.h"
#include "Tokens.h"
#include "FirstArray.h"
#include "lexical_analyzer.h"
#include "syntax_analyzer.h"
#include "vizualizer.h"

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

int main() {
    std::string str = "var b: Int;";
	grammar_type grammar = my_grammar();

	try {
		Tree pr = parser(str, grammar);
		run("4", pr);
	}
	catch (const std::exception& ex) {
		std::cout << "Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr!!!!!!!!!\n";
		std::cout << ex.what();
	}

	
}

