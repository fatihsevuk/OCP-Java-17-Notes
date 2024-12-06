package com.fth.ocp17.chapters.ch2.casting;

import java.util.List;

public class App {

    public static void main(String[] args) {

        // upcasting
        Cat cat = new Cat();
        Animal animal = (Animal) cat;

        // downcasting
        Animal animal2 = new Cat();
        ((Cat)animal2).meow();

        System.out.println(animal instanceof Object);
        System.out.println(animal2 instanceof Animal);

    }

}
