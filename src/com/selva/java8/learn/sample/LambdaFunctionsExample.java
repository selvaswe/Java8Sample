package com.selva.java8.learn.sample;

import com.selva.java8.learn.sample.Employee;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class LambdaFunctionsExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30),
                new Employee("Bob", 25),
                new Employee("Charlie", 35),
                new Employee("David", 40)
        );

        // 1. Using Consumer: Print each employee's details
        Consumer<Employee> printEmployee = emp -> System.out.println(emp);
        employees.forEach(printEmployee);

        // 2. Using Predicate: Filter employees older than 30
        Predicate<Employee> isOlderThan30 = emp -> emp.getAge() > 30;
        List<Employee> filteredEmployees = employees.stream()
                .filter(isOlderThan30) // Lambda expression
                .collect(Collectors.toList());

        System.out.println("\nEmployees older than 30: " + filteredEmployees);

        // 3. Using Function: Get names of all employees
        Function<Employee, String> getName = Employee::getName;
        List<String> names = employees.stream()
                .map(getName) // Method reference
                .collect(Collectors.toList());

        System.out.println("\nEmployee Names: " + names);

        // 4. Using BiConsumer: Print a greeting for each employee
        BiConsumer<Employee, String> greetEmployee = (emp, greeting) ->
                System.out.println(greeting + ", " + emp.getName() + "!");

        System.out.println("\nGreetings:");
        employees.forEach(emp -> greetEmployee.accept(emp, "Hello"));

        // 5. Using IntBinaryOperator: Calculate total age of all employees
        IntBinaryOperator sumAges = (age1, age2) -> age1 + age2;
        int totalAge = employees.stream()
                .mapToInt(Employee::getAge) // Extract ages as IntStream
                .reduce(0, sumAges); // Calculate total age

        System.out.println("\nTotal Age of Employees: " + totalAge);
    }
}
