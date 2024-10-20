package com.selva.java8.learn.functionalInterface;
import java.util.function.Function;

public class FunctionChainingExample {
    public static void main(String[] args) {
        // Define two functions
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;

        // Chain the functions: (x * 2) + 3
        Function<Integer, Integer> combinedFunction = multiplyBy2.andThen(add3);

        // Apply the combined function
        int result = combinedFunction.apply(5);
        System.out.println("Result: " + result);  // Output: 13
    }
}
