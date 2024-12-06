package com.fth.ocp17.chapters.ch3;

import lombok.*;
import lombok.experimental.SuperBuilder;

public class PatternMatching {

    double showCylinderVolume(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            double vol =  ((Car) vehicle).getCylinderVolume();
            return vol;
        }

        return 0;
    }


    /**
     * With pattern variable
     * @param vehicle
     * @return
     */
    double showCylinderVolume2(Vehicle vehicle) {
        if (vehicle instanceof Car vol) {
            return vol.getCylinderVolume();
        }

        return 0;
    }


    static void printIntegersOrNumbersGreaterThan5(Number number) {
        if(number instanceof Integer data && data.compareTo(5)>0) // DOES NOT COMPILE
            System.out.print(data);
    }

    void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.print(data.intValue());
        //System.out.print(data.intValue()); // DOES NOT COMPILE
    }

    void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data)) {
            return;
        }
        System.out.print(data.intValue());
    }

    void printOnlyIntegers2(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
            System.out.print(data.intValue());

        System.out.print(data.intValue());
    }



    public static void main(String[] args) {
        int x = 10;
        double y =2.4;
        printIntegersOrNumbersGreaterThan5(x);
    }


}


@Getter
@Setter
@AllArgsConstructor
class Vehicle {
    private Integer numberOfWheels;
    private String brand;
    private String color;
    private double price;

    String showFuelUse() {
        return "Fuel unknown!";
    }

}
@Getter
@Setter
class Car extends Vehicle {
    private double cylinderVolume;

    @Override
    String showFuelUse() {
        return "gasoline or diesel";
    }

    @Builder
    public Car(Integer numberOfWheels, String brand, String color, double price, double cylinderVolume) {
        super(numberOfWheels, brand, color, price);
        this.cylinderVolume = cylinderVolume;
    }
}

@Getter
@Setter
class Aircraft extends Vehicle {
    private double bodyLength;

    @Builder
    public Aircraft(Integer numberOfWheels, String brand, String color, double price, double bodyLength) {
        super(numberOfWheels, brand, color, price);
        this.bodyLength = bodyLength;
    }

    @Override
    String showFuelUse() {
        return "kerosene";
    }
}
