package com.fth.ocp17.chapters.ch1.creatingObjects;

public class ScopeExamples {

      /*
      Order matters for the fields and blocks of code.
      You can’t refer to a variable before it has been defined:
      */

      {
      String name1 = "sdsdsd";
      System.out.println(name1);
      System.out.println(ScopeExamples.NUMBER_OF_ARM);
      }

    static {
        System.out.println("This is a static block!");
    }


    private String name = "Fluffy";

    {
        System.out.println("setting field"+name);
    }

    public ScopeExamples() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public ScopeExamples(String name) {
        this.name = name;
        System.out.println("setting constructor"+name);
    }

    public static void main(String[] args) {
        ScopeExamples chick = new ScopeExamples();
        ScopeExamples chick2 = new ScopeExamples("xyz");
        System.out.println(chick.name);
        System.out.println(chick2.name);
    }


    static final int NUMBER_OF_ARM = 7;



    // static members of class
    // then foloowing order
    // order of initialization

    // 1- blocks and fields : in order of
    // 2- constructor
    // 3- other methods calls

}
