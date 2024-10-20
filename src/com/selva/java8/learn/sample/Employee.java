package com.selva.java8.learn.sample;


import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}

