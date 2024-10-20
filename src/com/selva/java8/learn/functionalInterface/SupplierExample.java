package com.selva.java8.learn.functionalInterface;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // 1. Supplier that generates a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();

        // Generate and print a random number
        System.out.println("Random Number: " + randomNumberSupplier.get());

        // 2. Supplier that provides a fixed string
        Supplier<String> stringSupplier = () -> "Hello, Supplier!";

        // Generate and print the fixed string
        System.out.println("Fixed String: " + stringSupplier.get());

        // 3. Supplier that generates a new Employee object
        Supplier<Employee> employeeSupplier = () -> new Employee("Alice", 30);

        // Generate and print the Employee object
        Employee employee = employeeSupplier.get();
        System.out.println("Employee: " + employee);
    }

    // Simple Employee class for demonstration
    static class Employee {
        String name;
        int age;

        Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', age=" + age + "}";
        }
    }
}
