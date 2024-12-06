package com.fth.ocp17.chapters.ch3;

public class MrRObot {


    public static void main(String[] args) {

        int age = 19;
        
        boolean isChild = (age < 18);
        boolean isYoung = (age > 18 && age < 24);
        boolean isAdult = (age > 24);


        if (isChild) {
            System.out.println("You are younger than 18");
        } else if (isYoung) {
            System.out.println("you are between 18 and 24");
        } else if (isAdult) {
            System.out.println("You are older than 24");
        } else {
            System.out.println("Your age is very big!!");
        }

    }
}
