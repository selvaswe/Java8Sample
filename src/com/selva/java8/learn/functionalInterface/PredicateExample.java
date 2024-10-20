package com.selva.java8.learn.functionalInterface;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Use the Predicate to filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven) // Applying the Predicate
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);

        // 2. Predicate to check if a number is greater than 5
        Predicate<Integer> isGreaterThanFive = number -> number > 5;

        // Use the Predicate to filter numbers greater than 5
        List<Integer> greaterThanFive = numbers.stream()
                .filter(isGreaterThanFive) // Applying the Predicate
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 5: " + greaterThanFive);

        // 3. Combining Predicates
        Predicate<Integer> isEvenAndGreaterThanFive = isEven.and(isGreaterThanFive);

        // Use the combined Predicate to filter numbers that are even and greater than 5
        List<Integer> evenAndGreaterThanFive = numbers.stream()
                .filter(isEvenAndGreaterThanFive) // Applying the combined Predicate
                .collect(Collectors.toList());

        System.out.println("Even Numbers greater than 5: " + evenAndGreaterThanFive);
    }
}
