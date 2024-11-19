package com.fth.ocp17.chapters.ch1.creatingObjects;

public class Robot {

    static {
        System.out.println("Robot static block..");
    }

    private int model = 99;

    {
        System.out.println("Instance block of Robot...type is :"+Robot.type);
    }

    public Robot() {
        System.out.println("Robot constructor...");
    }


    private static String type = "Default Type of all Robots";



}
