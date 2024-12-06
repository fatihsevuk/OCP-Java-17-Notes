package com.fth.ocp17.chapters.ch3;

public class SwitchCase {

    public String printDayOfWeek(int day) {
        String result = "";
        switch(day) {
            case 0:
                result = "Sunday";
                break;
            case 1:
                result =  "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            default:
                result = "Invalid Value";
                break;


        }

        return result;
    }

    public String printSeason(int month) {

        String season = "";

        switch(month) {
            case 1,2,3 : season += "Winter";
            case 4,5,6 : season += "Spring";
            case 7,8,9 : season += "Summer";
            default : season += "Unknown";
            case 10,11,12 : season += "Fall";
        }

        return season;
    }

    final int getCookies() {
        return 4;
    }

    /*void feedAnimal() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {
            case bananas :
            case apples : // does not compile
            case getCookies() : // does not compile
            case cookies : // does not compile
            case 3*5 :  // compiles and fit in switch data type without explicit cast
        }

    }*/


    public String printDayOfWeek2(int day) {
        var result = switch(day) {
            case 0 -> "Sunday" ;
            case 1 -> "Monday" ;
            case 2 -> "Tuesday" ;
            case 3 -> "Wednesday" ;
            case 4 -> "Thursday" ;
            case 5 -> "Friday" ;
            case 6 -> "Saturday" ;
            default-> "Invalid Value";
        };
        return result;
    }

    public void printSeason2(int month) {
        switch (month) {
            case 1,2,3 -> System.out.print("Winter");
            case 4,5,6 -> System.out.print("Spring");
            case 7,8,9 -> System.out.print("Summer");
            case 10,11,12 -> System.out.print("Fall");
        }
    }


    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();
        //System.out.println(sc.printDayOfWeek(7));
        System.out.println(sc.printSeason(15));
    }
}
