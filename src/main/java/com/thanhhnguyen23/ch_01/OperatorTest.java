package com.thanhhnguyen23.ch_01;

/**
 * Operator Test illustrate basic operators
 */
public class OperatorTest {

    public static void main(String[] args) {
        int a = 12, b = 8, c = 6;
        System.out.println(a + " " + b + " " + c);
        a = c; // a = 6
        System.out.println(a + " " + b + " " + c);
        c += b; // c = 14
        System.out.println(a + " " + b + " " + c);
        a = b + c; // a = 22
        System.out.println(a + " " + b + " " + c);
        a++; // a = 23
        ++b; // b = 9

        // NOTE: pay special attention to the prefix increments and postfix increments
        c = a++ + ++b; // c = 24 + 10 -> 34?
        System.out.println(a + " " + b + " " + c);
    }
}
