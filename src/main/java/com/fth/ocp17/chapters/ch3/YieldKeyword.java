package com.fth.ocp17.chapters.ch3;

public class YieldKeyword {

    String printFishType(int fish , int length) {

        return switch (fish) {
          case 1 -> "Goolfish";
          case 2 -> {yield "Trout";}
          case 3 -> {
              if(length > 10) yield "Blobfish";
              else yield "Green";
          }
          default -> "Swordfish";
        };
    }
}
