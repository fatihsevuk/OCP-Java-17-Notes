package com.fth.ocp17.chapters.ch1.creatingObjects;


public class Android extends Robot{

    static {
        System.out.println("Android static block...");
    }

    private int age = 5;


    @Override
    public String toString() {
        return "Android{" +
                "age=" + age +
                '}';
    }

    {
        System.out.println("Android instance block...");
    }

    public Android() {
        System.out.println("Android constructor...");
    }

    private static String name = "Android";

    public static void main(String[] args) {
        Android android = new Android();
        System.out.println("Age of Android is : "+android.age);

    }

}
