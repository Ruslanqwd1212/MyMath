package org.example;

public class MyMath {
    public static final double E = 2.718281828459045;
    public static final double PI = 3.141592653589793;

    public static int min(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else return secondNum;
    }


    public static double roundOfLength (int radius){
        return 2*PI*radius;
    }
    public static double roundSquare (int diameter) {
        return 2 * PI * diameter;
    }

}





