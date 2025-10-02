package org.example.forexercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario la cantidad de números
        System.out.println("Introduce la cantidad de números que vas a introducir en el programa");
        double num = scanner.nextInt();
        scanner.nextLine();
        double sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el " + (i + 1) + "º número.");
            int value = scanner.nextInt();
            scanner.nextLine();
            sum = sum + value;
        }
        double res = sum / num;
        System.out.println("La media es: " + res);

    }
}