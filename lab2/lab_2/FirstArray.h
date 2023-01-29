#pragma once
#include "Util.h"
#include <set>

std::unordered_map<std::string, std::set<std::string>> First(grammar_type grammar) {

    std::unordered_map<std::string, int> F;
    for (auto t : grammar) {
        F[t.first] = 0;
    }
    std::unordered_map<std::string, std::set<std::string>> FIRST;

    std::function<std::unordered_set<std::string>(std::string)> fst = [&FIRST, &fst](std::string rule) {

        std::function <std::string()> skip_whitespaces = [rule]() {
            std::string res = "";
            for (char ch : rule) {
                if (ch != ' ' && ch != '\n' && ch != '\r' && ch != '\t') {
                    res += ch;
                }
            }
            return res;
        };

        rule = skip_whitespaces();

        std::unordered_set<std::string> ret;

        if (rule == "") {
            ret.insert("");
            return ret;
        }
        if (rule[0] <= 'A' || rule[0] >= 'Z') {
            int i = 1;
            while (rule[i] >= 'a' && rule[i] <= 'z') {
                i++;
            }
            rule.erase(i);
            ret.insert(rule);
            return ret;
        }
        if (rule[0] >= 'A' && rule[0] <= 'Z') {
            int i = 1;
            while (rule.length() > 0 && rule[i] == '\'') {
                i++;
            }
            std::string rule_p = rule;
            rule.erase(i);
            rule_p.erase(0, i);
            ret.insert(FIRST[rule].begin(), FIRST[rule].end());
            if (ret.find("") != ret.end()) {
                ret.erase("");
                std::unordered_set<std::string> retb = fst(rule_p);
                ret.insert(retb.begin(), retb.end());
            }
            return ret;
        }
        return ret;
    };

    std::function<bool()> was_changed = [grammar, &FIRST, &F]() {

        for (auto t : grammar) {
            if (FIRST[t.first].size() != F[t.first]) {
                return true;
            }
        }
        return false;
    };

    do {
        for (auto t : grammar) {
            F[t.first] = FIRST[t.first].size();
        }
        for (auto t : grammar) {
            for (auto s : t.second) {
                std::unordered_set<std::string> fstr = fst(s);
                FIRST[t.first].insert(fstr.begin(), fstr.end());
            }

        }
    } while (was_changed());

    return FIRST;
}

std::string build_tree(Tree tr) {
    std::string res = "";
    res += "\"" + tr.get_elem() + "\"";
    res += ", { Tree(";
    std::vector<Tree> children = tr.get_children();
    if (children.size() == 0) {
        res += "), ";
        return res;
    }
    for (int i = 0; i < children.size(); i++) {
        res += build_tree(children[i]);
        if (res != "")
            res += ", ";
    }
    res += ")}";
    return res;
}