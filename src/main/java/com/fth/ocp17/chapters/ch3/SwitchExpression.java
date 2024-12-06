package com.fth.ocp17.chapters.ch3;

public class SwitchExpression {

    Integer getCountryCode(String country) {

        Integer countryCode = switch (country) {
            case "US" -> 1;
            case "TR" -> 90;
            case "DE" -> 49;
            case "CH" -> 41;
            case "NL" -> {
                System.out.println("Welcome to NL!!!");
                yield 31;
                // jep 325
            }
            default -> 0;

        };

        return countryCode;
    }


    public static void printSeason(int month) {
        switch (month) {
            case 1, 2, 3 -> System.out.print("Winter");
            case 4, 5, 6 -> System.out.print("Spring");
            case 7, 8, 9 -> System.out.print("Summer");
            case 10, 11, 12 -> System.out.print("Fall");
        }

        // syntatic sugar
        // ->
        // += , -= x+=10 x= x+10

        // https://techexpertise.medium.com/syntactic-sugars-in-java-1d8077ed286d



    }


    public static void printSeason12(int month) {
        switch (month) {
            case 1, 2, 3 : System.out.print("Winter");
            case 4, 5, 6 : System.out.print("Spring");
            case 7, 8, 9 : System.out.print("Summer");
            case 10, 11, 12 : System.out.print("Fall");
        }

    }


    public static void main(String[] args) {
        printSeason(3); // Winter
        System.out.println();
        printSeason12(4); //SpringSummerFall


        int measurement = 10;
        int size = switch (measurement) {
            case 5 -> 1;
            case 10 -> (short) 2;
            default -> 5;
            //case 20 -> "3"; // DOES NOT COMPILE
            //case 40 -> 4L; // DOES NOT COMPILE
            //case 50 -> null; // DOES NOT COMPILE
        };


        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }
            default -> "Swordfish";
        };

        getWeather(Season.FALL);

    }

    static String getWeather(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Rainy";
        };
    }
}


