package com.fth.ocp17.chapters.ch2.casting;

public class ExampleApp {


    public static void main(String[] args) {

        int tadpole = (int)((int)5 * 2L);

        short frog = (short)(3 - 2.0);

        float egg = (float)(2.0 / 9);

        //float egg = (2.0f / 9);

        // long feathers = 10(long); // DOES NOT COMPILE


        int fish = (int)1.0; // DOES NOT COMPILE


        //System.out.println(Short.MAX_VALUE); //

        short bird = (short)1921222; // DOES NOT COMPILE

        //System.out.println(bird);


       int mammal = (int)9f; // DOES NOT COMPILE

       // System.out.println(Integer.MAX_VALUE);

        long reptile = 192_301_398_193_810_323L; // DOES NOT COMPILE

        //System.out.print(2147483647+1); // -2147483647

        // -2147483648 , -2147483647 , -2147483646 ... 0 1,2,.... 2147483645, 2147483646, 2147483647

       // System.out.println(2147483647);


        short mouse = 10;
        short hamster = 3;
        short capybara = (short) (mouse * hamster); // DOES NOT COMPILE

        //short capybara2 = (short)(10*3) ; // DOES NOT COMPILE


        byte hat = (byte) 257;

        // -128 -127 -126 -1  0 1---  127



        //System.out.println(hat);

        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

        int number = 20;

       // number = number + 20; // 40

       // int i = number + 20;

        number+=20;
        number-=2;
        number*=3;
        number/=2; // 57


/*        long goat = 10;
        int sheep = 5;
        sheep = (int) (sheep * goat); // DOES NOT COMPILE*/

        long goat = 10;
        int sheep = 5;

        sheep *= goat;

        System.out.println(number);



    }

}
