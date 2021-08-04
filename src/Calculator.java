// TTS: Week 7, Day 3, Assignment 3:
// Create a Java Calculator Class that does the following five commands:

import java.lang.Math;

public class Calculator {

    // An add method that takes in two integer numbers and adds them together:
    public static int add(int num1, int num2) {
        int value;
        value = num1 + num2;
        return value;
    }

    // A subtraction method that takes in two integers and subtracts them from one another:
    public static int subtract(int num1, int num2) {
        int value;
        value = num1 - num2;
        return value;
    }

    // A multiplication method that takes in two integer numbers and multiplies them together:
    public static int multiply(int num1, int num2) {
        int value;
        value = num1 * num2;
        return value;
    }

    //A division method that takes in two integer numbers and divides them:
    public static int divide(int num1, int num2) {
        int value;
        value = num1 / num2;
        return value;
    }

    //A square method that takes in one integer and squares it:
    public static int subtract(int num1) {
        int value;
        value = num1 * num1;
        return value;
    }

//BONUS: Create a MagicCalculator that inherits its basic functionality from your calculator and does the following functions:

    //Finds the square root of a number:
    public static double squareRoot(int num1) {
        double value;
        value = Math.sqrt(num1);
        return value;
    }

    // Finds the sin (trigonometry) of a number:
    public static double sin(double angle) {
        double value;
        double radians = Math.toRadians(angle);
        value = Math.sin(radians);
        return value;
    }

    // Finds the cosine (trigonometry) of a number:
    public static double cos(double angle) {
        double value;
        double radians = Math.toRadians(angle);
        value = Math.cos(radians);
        return value;
    }

    // Finds the tangent (trigonometry) of a number:
    public static double tan(double angle) {
        double value;
        double radians = Math.toRadians(angle);
        value = Math.tan(radians);
        return value;

// Finds the factorial (!) of the number:
    }

    public static long factorial(long number) {
        long value = 1;
        int i = 1;
        while (i < number) {
            value = value * i;
            i++;
        }
        return value;
    }
}