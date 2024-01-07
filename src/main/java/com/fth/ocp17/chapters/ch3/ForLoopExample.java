package com.fth.ocp17.chapters.ch3;

public class ForLoopExample {

    void multipleVariableForLoop() {

        int x = 0;

        for (long y=0,z=4;x<5 && y<10;x++,y++) {
            System.out.print(y+ " ");
        }

        System.out.print(x+ " ");
    }
}
