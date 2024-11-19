package com.fth.ocp17.chapters.ch1.dataTypes;


import java.util.ArrayList;
import java.util.List;

public class MrRobot2 {

    int age = 20;

    String name = "FAtih";

    static int num1=1, num2=24, num3 = 23;
    //static int num2=24;
    //static int num3 = 23;

    static void printNumber() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }

    static void finalExampleMethod(){
        final int[] favoriteNumbers = new int[10];

        //effectively final
         int myAge = 33;

        final String myCity = "Erzurum";

        // myCity= "Kayseri";

        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        //favoriteNumbers = null; // DOES NOT COMPILE

        final List myVistedCountry = new ArrayList<String>();

        //myVistedCountry = new ArrayList<Integer>();

        myVistedCountry.add("GErmany");
        myVistedCountry.add("French");

        // 1 year later


        System.out.println("My Age is : "+myAge);

    }


    // static fabric method...
    Boolean isActive = Boolean.valueOf(Boolean.TRUE);

    //String block = """doe"""; // DOES NOT COMPILE

    static String block = """
    doe \
    deer""";

    static String block2 = """
\"""doe\"\"\"
\"deer\"""
""";


    // escape symbols
    static String eyeTest = "\"Java Study Guide\"\n by Scott & Jeanne";

    // usage of text block
    static String eyeTest2 = """
            merhaba benim adim Fatih,
                "BEn erzurumluyum..."
            """;

    public static void main(String[] args) {

        //System.out.println(eyeTest);
        //System.out.println(eyeTest2);
        //System.out.println(block2);

        printNumber();
    }



}
