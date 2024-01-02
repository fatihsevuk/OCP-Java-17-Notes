package com.fth.ocp17.chapters.ch3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {

    @Test
    @DisplayName("Test CylinderVolume")
    void getCylinderVolumeOfVehicleIfItIsCar() {
        PatternMatching patternMatching = new PatternMatching();
        Car car = Car.builder().brand("VW")
                .color("Red")
                .numberOfWheels(4)
                .price(35000).cylinderVolume(1250).build();

        assertEquals(8,patternMatching.showCylinderVolume(car));

    }


    @Test
    @DisplayName("Test CylinderVolume")
    void getCylinderVolumeOfVehicleIfItIsCarWithPatternVariable() {
        PatternMatching patternMatching = new PatternMatching();
        Car car = Car.builder().brand("VW")
                .color("Red")
                .numberOfWheels(4)
                .price(35000).cylinderVolume(1250).build();

        assertEquals(8,patternMatching.showCylinderVolume2(car));

    }


}
