package com.fth.ocp17.chapters.ch2;

public class UnaryOperators {

    static void testBitwiseOp() {
        int number = 10; // 1000

        // ~number = 0111 = 7

        System.out.println(~number);
        //System.out.println(Integer.toBinaryString(number));
    }


    static void testUnaryOp() {
        int number = 10;
        System.out.println(--number);
        System.out.println(number);
    }

    static void testCastOp() {
        double myDouble = 1.1;
        int myInt = (int) myDouble;

        System.out.println(myInt);
    }


    public static void main(String[] args) {
        testUnaryOp();
    }
}
