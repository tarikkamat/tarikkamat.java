package com.tarikkamat;

public class Main {
    // Subject: Methods
    // Task: Create a method that prints out the sum of two numbers
    // Method name: sum
    // Method parameters: int a, int b
    // Method return type: void
    // Example: sum(1, 2) -> 3

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum2(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {

        // Use the method here
        sum(1, 2);

        // Use the method here
        System.out.println(sum2(1, 2));

    }
}