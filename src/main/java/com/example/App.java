package com.example;

public class App {

    public static void main(String[] args) {
        var context = "hello world";
        var shouldEndWithPeriod = new ShouldEndWithPeriod();
        var result = shouldEndWithPeriod.interpret(context);

        System.out.println(result);
    }

}
