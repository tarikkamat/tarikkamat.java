package com.tarikkamat;

public class Main {
    public static void main(String[] args) {

        // Example if-else statement
        /*
        *
        *   if (condition) {
        *      // code to be executed if condition is true
        *  } else {
        *     // code to be executed if condition is false
        * }
        *
        * */


        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        } else {
            System.out.println("x is less than or equal to 5");
        }


        // Example if-else-if statement
        /*
        *
        *  if (condition1) {
        *     // code to be executed if condition1 is true
        * } else if (condition2) {
        *    // code to be executed if condition2 is true
        * } else {
        *   // code to be executed if both condition1 and condition2 are false
        * }
        *
        *
         */

        int y = 10;
        if (y == 10) {
            System.out.println("y is 10");
        } else if (y == 20) {
            System.out.println("y is 20");
        } else if (y == 30) {
            System.out.println("y is 30");
        } else {
            System.out.println("y is not present");
        }



        // Example switch statement
        /*
        *
        * switch(expression) {
        *  case x:
        *    // code block
        *   break;
        * case y:
        *  // code block
        * break;
        * default:
        * // code block
        * }
        *
        */

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("TuesDay");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            default:
                System.out.println("Looking forward to the Weekend");
        }


        // ? : Ternary Operator
        /*
        *
        * variable = (condition) ? expressionTrue :  expressionFalse;
         */

        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";



        // Loops

        // For Loop
        /*
        *
        * for (statement 1; statement 2; statement 3) {
        *  // code block to be executed
        * }
        *
         */

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While Loop
        /*
        *
        * while (condition) {
        * // code block to be executed
        * }
        *
         */

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }


        // Do-While Loop
        /*
        *
        * do {
        * // code block to be executed
        * }
        * while (condition);
        *
         */

        int j = 0;
        do {
            System.out.println(j);
            j++;
        }
        while (j < 5);



    }
}