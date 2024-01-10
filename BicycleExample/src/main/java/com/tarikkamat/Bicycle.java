package com.tarikkamat;

public class Bicycle {
    int speed = 0;
    int gear = 1;

    /**
     * Increases the speed of the bicycle by the given amount.
     * @param newValue The amount by which the speed is increased.
     */
    void changeGear(int newValue) {
        gear = newValue;
    }

    /**
     * Increases the speed of the bicycle by the given amount.
     * @param increment The amount by which the speed is increased.
     */
    void speedUp(int increment) {
        speed = speed + increment;
    }

    /**
     * Prints the current state of the bicycle.
     */
    void applyBrakes() {
        speed = speed - 5;
    }

    void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}
