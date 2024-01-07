package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopExampleTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ForLoopExample forLoopExample;

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
        forLoopExample = new ForLoopExample();
    }

    @Test
    void multipleVariableForLoop() {
        forLoopExample.multipleVariableForLoop();
        assertEquals("0 1 2 3 4 5 ",outContent.toString());
    }
}