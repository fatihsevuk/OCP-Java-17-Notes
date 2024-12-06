package com.fth.ocp17.chapters.ch2;

public class OperatorPrecedence {

    // unary - birli
    // binary - ikili
    // ternary - üclü

    static void printOperatorResult() {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.print("Zoo animal receives: " + reward + " reward points");
    }


    static void printOperatorResult2() {
        int height = 3;
        int length = 2;
        var perimeter = 2 * height + 2 * length;
        System.out.println(perimeter);
    }

    static void printOperatorResult3() {
        System.out.println(10 & 12);

        // 10 = 1010
        // 12 = 1100
        //&
        //-------------------
        //        1000 = 0*2pow0 + 0*2po1 +0*2pow2 + 1*2pow3

    }

    static void manupulateBit() {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte)(a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);
    }

    public static void main(String[] args) {
        //printOperatorResult();
        //printOperatorResult2();
        //manupulateBit();
        printOperatorResult3();

        // 1- x++, x--,
        // 2- ++x , --x
        // 3- -, !, ~, +, (type)
        // 4- -, !, ~, +, (type)
        // 5- (Type)reference - (Integer)number
        // 6- *, /, %
        // 7- +-
        // 8- <<, >>, >>>
        // 9- <, >, <=, >=, instanceof
        // 10- ==, !=
        // 11- &
        // 12- |
        // 13- &&
        // 14- ||
        // 15- boolean exp?exp1: exp2
        // 16- =, +=, -=, *=, /=, %=, &=,
                    //^=, |=, <<=, >>=, >>>=
        // 17- ->






    }



}
