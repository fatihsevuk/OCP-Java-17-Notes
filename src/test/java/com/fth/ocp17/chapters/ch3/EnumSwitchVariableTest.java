package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSwitchVariableTest {

    private EnumSwitchVariable enumSwitchVariable;

    @BeforeEach
    void setUp() {
        enumSwitchVariable = new EnumSwitchVariable();
    }

    @Test
    void getWeatherOfSummer() {
        assertEquals("Hot",enumSwitchVariable.getWeather(Season.SUMMER));
    }
}