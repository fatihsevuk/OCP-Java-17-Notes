package com.fth.ocp17.chapters.ch1;

public class MainMethodExample {

    public static void main(String... args) {
        System.out.println("Firstname: "+args[0]);
        System.out.println("Lastname: "+args[1]);
        System.out.println("Age: "+args[2]);
        System.out.println("City: "+args[3]);

        try {
            System.out.println("Country: "+args[4]);
        } catch (Exception ex) {
            System.out.println("Error Message: Ach so, du hast recht wir haben keine 5. elemnt, biite gibt eine passende wert dafür ein.");
        }

    }

}
