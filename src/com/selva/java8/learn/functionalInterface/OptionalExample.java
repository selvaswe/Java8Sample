package com.selva.java8.learn.functionalInterface;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        // 1. Create Optional with a value
        Optional<String> optionalWithValue = Optional.of("Hello, Java 8 Optional!");
        System.out.println("Optional with value: " + optionalWithValue.get());

        // 2. Create Optional from a nullable value
        String nullableString = null;
        Optional<String> optionalNullable = Optional.ofNullable(nullableString);

        // 3. Check if value is present using isPresent()
        if (optionalNullable.isPresent()) {
            System.out.println("Value is present: " + optionalNullable.get());
        } else {
            System.out.println("No value present");  // Output: No value present
        }

        // 4. Using ifPresent()
        optionalWithValue.ifPresent(value -> System.out.println("ifPresent: " + value));

        // 5. Using orElse()
        String orElseValue = optionalNullable.orElse("Default Value");
        System.out.println("orElse: " + orElseValue);  // Output: Default Value

        // 6. Using orElseGet()
        String orElseGetValue = optionalNullable.orElseGet(() -> "Generated Default Value");
        System.out.println("orElseGet: " + orElseGetValue);  // Output: Generated Default Value

        // 7. Using orElseThrow()
        try {
            optionalNullable.orElseThrow(() -> new RuntimeException("Value not present in Optional"));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());  // Output: Value not present in Optional
        }

        // 8. Example of map() and flatMap() with Optional
        Optional<String> optionalMap = optionalWithValue.map(String::toUpperCase);
        System.out.println("Mapped value: " + optionalMap.orElse("No value"));  // Output: HELLO, JAVA 8 OPTIONAL!

        Optional<String> optionalFlatMap = optionalWithValue.flatMap(value -> Optional.of(value.toLowerCase()));
        System.out.println("FlatMapped value: " + optionalFlatMap.orElse("No value"));  // Output: hello, java 8 optional!
    }
}
