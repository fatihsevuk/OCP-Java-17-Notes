package com.fth.ocp17.chapters.ch4;

public class StringMethods {

    public static void main(String[] args) {
        String name = "MrRobot";
        System.out.println(name.indexOf('R')); // 2
        System.out.println(name.indexOf("bo")); // 4
        System.out.println(name.indexOf("o",4)); // 5
        System.out.println(name.indexOf("ob",2)); // 3
        System.out.println(name.indexOf("obx",2)); // -1


        System.out.println(name.substring(3)); // obot
        System.out.println(name.substring(name.indexOf('b'))); // bot
        System.out.println(name.substring(3,6)); // obo
        System.out.println(name.substring(3,3)); // empty string
        //  System.out.println(name.substring(3,8)); // exception
        // System.out.println(name.substring(3,2)); // exception

        System.out.println(name.contains("Rok"));

    }
}
