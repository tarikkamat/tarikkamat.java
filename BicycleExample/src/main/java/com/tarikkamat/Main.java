package com.tarikkamat;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bicycle Object Oriented Programming Example");

        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on those objects
        System.out.println("Bike 1");
        bike1.changeGear(2);
        bike1.speedUp(10);
        bike1.applyBrakes();
        bike1.printStates();

        System.out.println();

        System.out.println("Bike 2");
        bike2.changeGear(3);
        bike2.speedUp(20);
        bike2.applyBrakes();
        bike2.printStates();

        System.out.println();

        // We find first bike
        if (bike1.speed > bike2.speed) {
            System.out.println("Bike 1 is faster than Bike 2");
        } else if (bike1.speed < bike2.speed) {
            System.out.println("Bike 2 is faster than Bike 1");
        } else {
            System.out.println("Bike 1 and Bike 2 are equally fast");
        }


    }
}