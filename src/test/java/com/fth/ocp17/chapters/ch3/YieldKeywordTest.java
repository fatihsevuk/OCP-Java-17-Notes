package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YieldKeywordTest {


    private YieldKeyword yieldKeyword;


    @BeforeEach
    void setUp() {
        yieldKeyword = new YieldKeyword();
    }

    @Test
    void printFishTypeOfSwordfishTest() {

        assertEquals("Trout",yieldKeyword.printFishType(2,10));

    }
}