package com.selva.java8.learn.functionalInterface;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        // Initial List of Strings
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "John", "Alice", "Doe");

        // 1. Create a Stream from the List
        Stream<String> nameStream = names.stream();

        // 2. Filter: Keep only names that start with 'J'
        List<String> filteredNames = nameStream
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println("2 Filtered Names (start with 'J'): " + filteredNames);

        // 3. Map: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("3 Names in Upper Case: " + upperCaseNames);

        // 4. Distinct: Remove duplicate names
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("4 Distinct Names: " + distinctNames);

        // 5. Sorted: Sort the names in natural order
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("5 Sorted Names: " + sortedNames);

        // 6. Limit: Get the first 3 names from the list
        List<String> limitedNames = names.stream()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("6 Limited to First 3 Names: " + limitedNames);

        // 7. Skip: Skip the first 2 names
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("7  After Skipping First 2 Names: " + skippedNames);

        // 8. Reduce: Concatenate all names with a comma separator
        Optional<String> concatenatedNames = names.stream()
                .reduce((name1, name2) -> name1 + ", " + name2);

        concatenatedNames.ifPresent(concatenated ->
                System.out.println("8 Concatenated Names: " + concatenated)
        );

        // 9. forEach: Print each name individually
        System.out.print("9 Names Printed Individually: ");
        names.stream().forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 10. Combining Multiple Operations:
        List<String> combinedOperations = names.stream()
                .filter(name -> name.startsWith("J"))  // Filter names starting with 'J'
                .map(String::toUpperCase)             // Convert to uppercase
                .distinct()                           // Remove duplicates
                .sorted()                             // Sort in natural order
                .limit(2)                             // Limit to 2 names
                .collect(Collectors.toList());        // Collect results to a list

        System.out.println("10 Combined Operations Result: " + combinedOperations);
    }
}
/*
Explanation of the Program:
1 Creating a Stream from the list of names.
2 Filtering names that start with 'J'.
3 Mapping names to uppercase.
4 Removing duplicates using distinct().
5 Sorting names in natural order.
6 Limiting to the first 3 names.
7 Skipping the first 2 names.
8 Concatenating all names using reduce().
9 Printing each name individually using forEach().
10 Combining multiple operations to demonstrate filtering, mapping, distinct, sorting, and limiting.
 */