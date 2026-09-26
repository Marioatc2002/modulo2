package com;

public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingresa la temeparatura en grados Celsius: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

    }
}
