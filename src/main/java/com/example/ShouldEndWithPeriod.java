package com.example;

public class ShouldEndWithPeriod implements Expression {

    private final StringShouldStartWithCapitalLetter stringShouldStartWithCapitalLetter = new StringShouldStartWithCapitalLetter();

    @Override
    public String interpret(String context) {
        if (!context.endsWith(".")) {
            context = context + ".";
        }
        return stringShouldStartWithCapitalLetter.interpret(context);
    }
}
