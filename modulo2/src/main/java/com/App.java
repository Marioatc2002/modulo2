package com;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        char varChar = 'A';
        char varChar2 = 'B';
        boolean varBool;
        int a = 20;
        a += 5;
        System.out.println("R = " + a);
        a = a + 5;
        System.out.println("R = " + a);
        a++;
        System.out.println("R = " + a);
        varBool = varChar == varChar2;
        System.out.println("R = " + varBool);
    }
}
