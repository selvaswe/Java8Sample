package com.selva.java8.learn.functionalInterface;

import java.util.function.Function;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // Using method reference to the static method
        Function<String, Integer> stringLength = String::length;

        // Apply the function
        int length = stringLength.apply("Java");
        System.out.println("Length of 'Java': " + length);  // Output: 4
    }
}
