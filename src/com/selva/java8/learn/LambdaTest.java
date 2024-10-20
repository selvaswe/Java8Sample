package com.selva.java8.learn;


public class LambdaTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // new LambdaTest().hello();


        iTest h = () ->
                System.out.println("hello Selva!!!---functional interface");


        h.hello();

        h = () ->
                System.out.println("hello Selva!!!---functional interface-second");

        h.hello();

    }

    public void hello() {
        System.out.println("hello Selva!!!");
    }

}

interface iTest {
    void hello();
}
