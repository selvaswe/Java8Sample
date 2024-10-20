package com.selva.java8.learn.sample;


import java.util.function.Function;

@FunctionalInterface
interface MyCalculator {
    int calculate(int a, int b);
}

public class LambdaFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a functional interface with a lambda expression
        MyCalculator addition = (a, b) -> a + b;
        MyCalculator subtraction = (a, b) -> a - b;

        System.out.println("Addition: " + addition.calculate(5, 3)); // Outputs: 8
        System.out.println("Subtraction: " + subtraction.calculate(5, 3)); // Outputs: 2

        // Using a built-in functional interface
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4: " + square.apply(4)); // Outputs: 16
    }
}
