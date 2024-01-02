package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class SwitchCaseTest {

    private SwitchCase switchCase;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @BeforeEach
    void setUp() {
        switchCase = new SwitchCase();
    }

    @Test
    @DisplayName("Test Invalid Week Day")
    void printInvalidMessageIfDayNumberIsOutOfRange() {
        assertEquals("Invalid Value",switchCase.printDayOfWeek(12));
    }


    @Test
    @DisplayName("Test No Break Statement")
    void printSeasonWithoutBreakStatement() {
        assertEquals("WinterSpringUnknownSummerFall",switchCase.printSeason(2));
    }

    @Test
    @DisplayName("Test Week Day")
    void printDayOfWeek2() {
        assertEquals("Sunday",switchCase.printDayOfWeek2(0));
    }

    @Test
    void printSeason2() {
        switchCase.printSeason2(2);
        assertEquals("Winter", outContent.toString());
    }
}