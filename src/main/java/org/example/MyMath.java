package org.example;

public class MyMath {
    public static final double E = 2.718281828459045;
    public static final double PI = 3.141592653589793;

    public static <T extends Comparable<T>> T min(T a, T b) {
        return a.compareTo(b) < 0 ? a : b;
    }


}


