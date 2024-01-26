package com.fth.ocp17.chapters.ch3;

public class BreakStatements {

    public static void main(String[] args) {

        int[][] list = {{1, 13}, {5, 2}, {2, 2}};

        int searchValue = 2;
        int posX = -1;
        int posY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    posX = i;
                    posY = j;
                    //break PARENT_LOOP;
                    //break;
                }
            }
        }

        if (posX == -1 || posY == -1) {
            System.out.println("Value "+searchValue+" not found!");
        } else {
            System.out.println("Value "+searchValue+" found at: "+ "("+posX+","+posY+")");
        }


    }
}
