package com.fth.ocp17.chapters.ch2.makingDecision;

public class MyApp {

    public static void main(String[] args) {

        // ternary operator

        int myAge = 17;

        //getDrivingLicence(17);

        ternarySideEffect();

    }


    static void getDrivingLicence(int age) {

/*        if (age < 18) {
            System.out.println("You have not right to get driving licence");
        } else {
            System.out.println("You can get driving licence");
        }*/

        // refactor with ternay


        String msg = ( (age < 18) ? (getNoRightMessage()) : (getRightMessage()) );

        System.out.println(msg);

    }

    static String getNoRightMessage() {
        return "You have not right to get driving licence";
    }

    static String getRightMessage() {
        return "You can get driving licence";
    }


    static void ternarySideEffect() {
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz < 10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz); // 2,1
    }






}
