package com.fth.ocp17.chapters.ch3;

public class WhileLoopExamples {


    public int printNumber(int number) {
        do {
            number++;
        }while (false);
        return number;
    }

    public int decreaseNumberUntil1(int number) {
        do {
            --number;
        }while (number > 1);
        return number;
    }


}
