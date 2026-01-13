package com.example;

public class StringShouldStartWithCapitalLetter implements Expression {
    @Override
    public String interpret(String context) {
        var firstLetter = context.substring(0, 1);
        return firstLetter.toUpperCase() + context.substring(1);
    }
}
