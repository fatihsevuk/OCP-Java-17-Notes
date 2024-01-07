package com.fth.ocp17.chapters.ch3;


public class EnumSwitchVariable {

    String getWeather(Season value) {

        return switch(value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}
