package com.selva.java8.learn.functionalInterface;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Create a Consumer to print each name
        Consumer<String> printName = name -> System.out.println("Hello, " + name + "!");

        // Use the Consumer to print each name in the list
        System.out.println("Using Consumer to greet each name:");
        names.forEach(printName);

        // Another example: Modify names and print
        Consumer<List<String>> modifyAndPrintNames = nameList -> {
            // Add a greeting to each name and print it
            for (String name : nameList) {
                System.out.println("Welcome, " + name + "!");
            }
        };

        // Use the Consumer to modify and print names
        System.out.println("\nUsing Consumer to modify and print names:");
        modifyAndPrintNames.accept(names);
    }
}
