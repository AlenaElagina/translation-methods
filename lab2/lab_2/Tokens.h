#pragma once
#include <unordered_map>
#include <string>

enum Tokens {
	VARIABLE,
    COLON,
	TYPE,
	NUMBER,
    KEYWORD_VAL,
    KEYWORD_VAR,
	EQUAL,
	SEMICOLON,
	END
};

struct token {

    token() = default;
    token(std::string token_value, Tokens token) : value(token_value), tk(token) {}

    Tokens get_token() {
        return tk;
    }

    std::string get_value() {
        return value;
    }

private:
    Tokens tk;
    std::string value;
};