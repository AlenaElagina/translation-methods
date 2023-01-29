#pragma once
#include "Util.h"

struct syntax_analyzer {

    syntax_analyzer() = default;
    syntax_analyzer(grammar_type grammar, std::vector<token> token_seq) : token_index(0),
        cur_token(token_seq[token_index]),
        parse_tree(E()),
        token_seq(token_seq) {}

    void next_token() {
        token_index++;
        cur_token = token_seq[token_index];
    }

    Tree E() {
        switch (cur_token.get_token()) {
        case KEYWORD_VAL: 
        case KEYWORD_VAR: {
            Tree tr1 = T();
            next_token();
            Tree tr2 = E();
            return Tree("E", { tr1, Tree(";"), tr2 });
        }
        default:
            return Tree("E", { Tree("eps") });
            break;
        }
    }

    Tree T() {
        switch (cur_token.get_token())
        {
        case KEYWORD_VAL:
        case KEYWORD_VAR: {
            Tree tr1 = F();
            next_token();
            Tree tr2 = P();
            return Tree("T", { tr1, Tree(":"), tr2 });
        }
        default:
            break;
        }
    }

    Tree F() {
        switch (cur_token.get_token()) {
        case KEYWORD_VAL:
        case KEYWORD_VAR:
            return Tree("F", { Q(), V() });
        default:
            break;
        }
    }

    Tree P() {
        switch (cur_token.get_token())
        {
        case TYPE:
            return Tree("P", { H(), B() });
        default:
            break;
        }
    }

    Tree Q() {
        switch (cur_token.get_token()) {
        case KEYWORD_VAL:
        case KEYWORD_VAR: {
            std::string s = cur_token.get_value();
            next_token();
            return Tree("Q", { Tree(s) });
        }
        default:
            break;
        }
    }

    Tree V() {
        switch (cur_token.get_token())
        {
        case VARIABLE: {
            std::string s = cur_token.get_value();
            next_token();
            return Tree("V", { Tree(s) });
        }
        default:
            break;
        }
    }

    Tree H() {
        switch (cur_token.get_token())
        {
        case TYPE: {
            std::string s = cur_token.get_value();
            next_token();
            return Tree("H", { Tree(s) });
        }
        default:
            break;
        }
    }

    Tree B() {
        switch (cur_token.get_token())
        {
        case EQUAL:
            next_token();
            return Tree("B", { Tree("="), A() });
        default:
            return Tree("B", { Tree("eps")});
        }
    }

    Tree A() {
        switch (cur_token.get_token())
        {
        case NUMBER: {
            std::string s = cur_token.get_value();
            next_token();
            return Tree("A", { Tree(s) });
        }
        default:
            break;
        }
    }

    Tree get_tree() {
        return parse_tree;
    }

private:
    int token_index;
    token cur_token;
    std::vector<token> token_seq;
    Tree parse_tree;
};

Tree parser(std::string expression, grammar_type grammar) {
    //grammar_type new_grammar = normalize_grammar(grammar);
    try {
        std::vector<token> token_seq = lexical_analyzer(expression);
        syntax_analyzer synana(grammar, token_seq);
        return synana.get_tree();
    }
    catch (const std::exception& ex) {
        throw ex;
    }
}
