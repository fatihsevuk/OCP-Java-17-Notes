package com.fth.ocp17.chapters.ch6.overrideMethods;

public class Panda extends Bear {

    public static void eat() {
        System.out.println("Bear is eating!");
    }

    public static void main(String[] args) {
        eat();
    }

}

class Bear {
    public static void eat() {
        System.out.println("Panda is chewing!");
    }
}
