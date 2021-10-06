package com.thanhhnguyen23.ch_01;

/**
 * illustrate of method declaration and calls
 */
public class MinTest {

    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        System.out.println(min (a, b));
    }

    private static int min(int x, int y) {
        return x < y ? x : y;
    }
}
