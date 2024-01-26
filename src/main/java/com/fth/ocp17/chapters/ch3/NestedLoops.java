package com.fth.ocp17.chapters.ch3;

public class NestedLoops {

    public static void main(String[] args) {

        int[][] multiDimArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        for (int[] simpleArray : multiDimArray) {
            for (int i = 0; i < simpleArray.length; i++) {
                System.out.print(simpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
}
