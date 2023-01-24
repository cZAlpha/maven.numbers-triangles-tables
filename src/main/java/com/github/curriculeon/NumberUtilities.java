package com.github.curriculeon;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";

        // TODO - Concatonate all even numbers between the "start" and "stop" perameters into one string without any separation.
            // Stop not included

        // For loop that goes from start to stop, not including stop
        for (int i = start ; i < stop ; i++ ){
            if ( i % 2 == 0){
                result += i;
            }
        }

        return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";

        // TODO - Concatonate all even numbers between the "start" and "stop" perameters into one string without any separation.
        // Stop not included

        // For loop that goes from start to stop, not including stop
        for (int i = start ; i < stop ; i++ ){
            if ( i % 2 != 0){
                result += i;
            }
        }

        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";

        for(int i = start ; i < stop ; i = i + step){
            result += (i * i);
        }

        return result;
    }

    public static String getRange(int stop) {
        return getRange(0, stop);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";

        // Yes I copied you, but I at least have the class to change the while to a for loop to be sneaky ;)
        for (int i = start ; i < stop ; i = i + step){
            result += i;
        }

        return result;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";

        for(int i = start ; i < stop ; i = i + step){
            result += (int)Math.pow(i, exponent);
        }

        return result;
    }
}
