#pragma once
#include <unordered_set>
#include <iostream>
#include <functional>
#include <set>
#include "Tokens.h"
#include "Tree.h"
#include "lexical_analyzer.h"

using grammar_type = std::unordered_map<std::string, std::unordered_set<std::string>>;

grammar_type my_grammar() {
    grammar_type grammar;
    grammar["E"].insert("T ; E");
    grammar["T"].insert("F : P");
    grammar["F"].insert("Q V");
    grammar["V"].insert("name");
    grammar["P"].insert("H B");
    grammar["B"].insert("eps");
    grammar["B"].insert("= A");
    grammar["H"].insert("type");
    grammar["A"].insert("number");
    grammar["E"].insert("eps");
    grammar["Q"].insert("keyword");

    return grammar;
}
