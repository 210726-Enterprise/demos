package com.revature;

import java.util.function.Predicate;

public class MemberPredicate {

    private String name;

    Predicate<String> nameContainsX = (name) -> name.contains("X");

    public MemberPredicate() {
    }

    public MemberPredicate(String name, Predicate<String> nameContainsX) {
        this.name = name;
        this.nameContainsX = nameContainsX;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Predicate<String> getNameContainsX() {
        return nameContainsX;
    }

    public void setNameContainsX(Predicate<String> nameContainsX) {
        this.nameContainsX = nameContainsX;
    }
}
