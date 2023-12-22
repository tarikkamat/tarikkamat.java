package com.tarikkamat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Create a static variable
    static int number2 = 10;

    void method() {
        // Create a local variable
        String message = "Hello World";
    }

    public static void main(String[] args) {
        // Create a instance variable
        int number = 20;

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        // Narrowing Casting
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        // Show the result
        System.out.println(myDouble); // Outputs 9.0
        System.out.println(myInt2); // Outputs 9

    }
}