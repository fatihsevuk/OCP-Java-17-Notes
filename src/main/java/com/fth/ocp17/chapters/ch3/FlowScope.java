package com.fth.ocp17.chapters.ch3;

public class FlowScope {


    // If input of this method doesn't inherit Integer , the data variable is undefined.Compiler cannot guarantee that data is an instance of Integer.
    /*void printIntegersOrNumberGreaterThan5(Number number) {
        if (number instanceof Integer data || data.compareTo(5) >0) {
            System.out.println(data);
        }
    }*/


    /*void printIntegerTwice(Number number) {
        if(number instanceof Integer data)
            System.out.println(data.intValue());

        System.out.println(data.intValue());
    }*/


    //
    void printOnlyIntegers(Number number) {
        if(!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());

    }


}
