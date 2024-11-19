package com.fth.ocp17.chapters.ch1.understandPackkage;

import com.fth.ocp17.chapters.ch1.creatingObjects.MrRobot;

public class Android extends MrRobot{

    public void printInfo() {
        Android android = new Android();
        System.out.println(android.age);
    }

    public static void main(String[] args) {

        Android android = new Android();
        var mrrobot = new MrRobot();

        System.out.println(android.age);
    }
}
