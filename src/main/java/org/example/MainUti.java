package org.example;

public class MainUti {
    public static void maiUti(String[] args) {
        double value = 1.0;


        double aCos = Math.acos(value);
        System.out.println("arcCos(1.0) = " + aCos);


        double aSin = Math.asin(value);
        System.out.println("arcSin(1.0) = " + aSin);


        value = 1;
        double aTan = Math.atan(value);
        System.out.println("aTan = " + aTan);


        double aTan2 = Math.atan(value);
        System.out.println("aTan2 = " + aTan2);
    }
}
