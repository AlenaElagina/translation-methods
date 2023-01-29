#pragma once
#include <vector>
#include <iostream>
#include <functional>
#include "Tokens.h"

bool check_number(std::string str) {
    for (int i = 0; i < str.size(); i++)
    if ((str[i] < '0') || (str[i] > '9'))
        return false;
    return true;
}

std::vector<token> lexical_analyzer(std::string parse_string) {

    std::vector<token> res;

    std::function<std::string()> next_word = [&parse_string]() {

        int i = 0;
        while (i != parse_string.size() && parse_string[i] == ' ') {
            i++;
        }
        std::string res = "";
        if (i != parse_string.size() && (parse_string[i] == ';' || parse_string[i] == ':')) {
            res += parse_string[i];
            parse_string.erase(0, i + 1);
            return res;
        }
        while (i != parse_string.size() && parse_string[i] != ' ' && parse_string[i] != ';' && parse_string[i] != ':') {
            res += parse_string[i];
            i++;
        }
        parse_string.erase(0, i);
        return res;

    };


    std::function<token()> next_token = [&parse_string, next_word]() {

        std::string word = next_word();
        if (word == "val") {
            return token(word, KEYWORD_VAL);
        }
        else if (word == "var") {
            return token(word, KEYWORD_VAR);
        }
        else if (word == ":") {
            return token(word, COLON);
        }   
        else if (word == "Int") {
            return token(word, TYPE);
        }
        else if (word == "=") {
            return token(word, EQUAL);
        }
        else if (word == ";") {
            return token(word, SEMICOLON);
        }
        else if (word == "") {
            return token("$", END);
        }
        else if (check_number(word)) {
            return token(word, NUMBER);
        }
        else {
            if (word[0] >= '0' && word[0] <= '9') {
                throw std::exception("Variable name is incorrect");
            }
            return token(word, VARIABLE);
        }

    };

    std::function<void(std::vector<token>)> check_legal = [](std::vector<token> r) {

        if (r.size() == 1) {
            throw std::exception("Input is empty");
        }

        int i = 0;
        Tokens tk1 = r[i].get_token();
        Tokens tk2 = r[i + 1].get_token();

        if (i == 0 && (tk1 != KEYWORD_VAR && tk1 != KEYWORD_VAL)) {
            throw std::exception("The KEYWORD should be first");
        }

        while (tk2 != END) {
            if ((tk1 == KEYWORD_VAL && tk1 != KEYWORD_VAR) && tk2 != VARIABLE) {
                throw std::exception("The KEYWORD should be followed by a VARIABLE");
            }

            if ((i + 4 < r.size()) && (tk1 == KEYWORD_VAL  && r[i + 4].get_token() != EQUAL)) {
                throw std::exception("The VAL should be initialized");
            }

            if (tk1 == VARIABLE && tk2 != COLON) {
                throw std::exception("The VARIABLE should be followed by a COLON");
            }

            if (tk1 == COLON && tk2 != TYPE) {
                throw std::exception("The COLON should be followed by a TYPE");
            }

            if (tk1 == TYPE && !((tk1 == TYPE && tk2 == SEMICOLON) || (tk1 == TYPE && tk2 == EQUAL))) {
                throw std::exception("The TYPE should be followed by a SEMICOLON or EQUAL");
            }

            if (tk1 == EQUAL && tk2 != NUMBER) {
                throw std::exception("The EQUAL should be followed by a NUMBER");
            }

            if (tk1 == NUMBER && tk2 != SEMICOLON) {
                throw std::exception("The NUMBER should be followed by a SEMICOLON");
            }

            if (tk1 == SEMICOLON && !((tk1 == SEMICOLON && (tk2 == KEYWORD_VAL && tk2 == KEYWORD_VAR)) 
                || (tk1 == SEMICOLON && tk2 == END))) {
                throw std::exception("The SEMICOLON should be followed by a KEYWORD or END");
            }

            tk1 = tk2;
            tk2 = r[++i + 1].get_token();

        }

        if (tk1 != SEMICOLON) {
            throw std::exception("SEMICOLON was expected here");
        }

    };

    token curToken;
    Tokens tk = curToken.get_token();
    do {
        try {
            curToken = next_token();
            tk = curToken.get_token();
        }
        catch (const std::exception& ex) {
            throw ex;
            break;
        }
        res.push_back(curToken);
    } while (tk != END);

    try {
        check_legal(res);
    }
    catch (const std::exception& ex) {
        throw ex;
    }

    return res;
}
