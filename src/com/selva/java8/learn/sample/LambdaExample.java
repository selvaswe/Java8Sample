package com.selva.java8.learn.sample;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30),
                new Employee("Bob", 25),
                new Employee("Charlie", 35),
                new Employee("David", 40)
        );

        // 1. Filter employees older than 30 and collect their names
        List<String> namesOfEmployeesOver30 = employees.stream()
                .filter(emp -> emp.getAge() > 30) // Lambda expression
                .map(Employee::getName) // Method reference
                .collect(Collectors.toList());

        System.out.println("Employees older than 30: " + namesOfEmployeesOver30);

        // 2. Create a sorted list of employee names
        List<String> sortedNames = employees.stream()
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Employee Names: " + sortedNames);

        // 3. Calculate the average age of employees
        OptionalDouble averageAge = employees.stream()
                .mapToInt(Employee::getAge) // Extract ages as IntStream
                .average(); // Calculate average

        averageAge.ifPresent(avg -> System.out.println("Average Age: " + avg));


        ////////////////////////////////////////////////////////////

        // 1 .No Parameters
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();


        // 2. One Parameter
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Hello, World!");


        //3. Multiple Parameters
        BiConsumer<String, Integer> greeter = (name, age) -> System.out.println("Hello " + name + ", you are " + age + " years old.");
        greeter.accept("Alice", 30);

    }
}