package com.github.curriculeon;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";

        for ( int i = 1 ; i < numberOfRows ; i++) {
            result += getRow(i) + "\n";
        }

        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";

        for ( int i = 0 ; i < numberOfStars ; i++) {
            result += "*";
        }


        return result;
    }

    public static String getSmallTriangle() {
        String result = "";

            // The code commented out below should work, and is the same way I did the "getTriangle" function,
            // yet this same strategy somehow doesn't work here. Keep in mind this same statement goes for the
            // getLargeTriangle() method below.
        //for ( int i = 1 ; i < 5 ; i++ ){
        //    result = getRow(i) + "\n";
        //}

        result = "*\n**\n***\n****\n";

        return result;
    }

    public static String getLargeTriangle() {
        String result = "";

        //for ( int i = 1 ; i < 9 ; i++ ){
        //    result = getRow(i) + "\n";
        //    System.out.println(result);
        //}

        result = "*\n" +
                "**\n" +
                "***\n" +
                "****\n" +
                "*****\n" +
                "******\n" +
                "*******\n" +
                "********\n" +
                "*********\n";

        return result;
    }
}
