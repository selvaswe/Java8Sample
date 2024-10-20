package com.selva.java8.learn.functionalInterface;

interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Stopping the vehicle...");
    }

    // Another default method
    default void honk() {
        System.out.println("Honking the horn!");
    }
}

class Car implements Vehicle {
    // Implementing the abstract method
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    // Optionally, override the default method
    @Override
    public void stop() {
        System.out.println("Car is stopping with ABS brakes...");
    }
}

class Bike implements Vehicle {
    // Implementing the abstract method
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    // Using the default method from the interface without overriding
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        // Create objects of Car and Bike
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Call start() and stop() methods on Car
        car.start();   // Output: Car is starting...
        car.stop();    // Output: Car is stopping with ABS brakes...

        // Call start() and stop() methods on Bike
        bike.start();  // Output: Bike is starting...
        bike.stop();   // Output: Stopping the vehicle...

        // Calling the default method honk() on both
        car.honk();    // Output: Honking the horn!
        bike.honk();   // Output: Honking the horn!
    }
}
