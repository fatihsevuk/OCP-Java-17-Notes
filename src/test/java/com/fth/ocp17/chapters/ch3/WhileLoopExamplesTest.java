package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhileLoopExamplesTest {

    private WhileLoopExamples whileLoopExamples;

    @BeforeEach
    void setUp() {
        whileLoopExamples = new WhileLoopExamples();
    }

    @Test
    void printResultIfNumberIs6() {
        assertEquals(7,whileLoopExamples.printNumber(6));
    }

    @Test
    void printDecreaseResultIfNumberIs6() {
        assertEquals(2,whileLoopExamples.decreaseNumberUntil1(6));
    }

}