package com.fth.ocp17.chapters.ch2.numericPromotion;

public class PromotionExample {

    public static void main(String[] args) {

        int x =1212;
        long y = 2L;

        System.out.println(x+y);

        //1- If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
        long z = y + x ;

        //2- If one of the values is integral and the other is floating-point, Java will automatically promote the integral value to the floating-point value’s data type.

        float d = 10f;
        int k = 5;

        double t = d +k;
        System.out.println(t);

        //3- Smaller data types, namely, byte, short, and char, are first promoted to int any time they’re used with a Java binary arithmetic operator with a variable (as opposed to a value), even if neither of the operands is int.

        byte myVar = 4;
        int n1 = 5;

        int result = myVar + n1;

        char c = 'a';
        int xyz = 7;

        int result2 = c +xyz;


        //



    }
}
