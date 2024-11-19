package com.fth.ocp17.chapters.ch1.variabkles;

public class Zoo {

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    public void doesThisCompile(boolean check) {
        var question = 2;
        question = 1;

        var answer = 34;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }

        System.out.println(answer);
    }


    public void eatCheese() {
        eat(3);
    }

    public void eat(int asaas) {
        int bitesOfCheese = 1;
        asaas += 3;
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

}