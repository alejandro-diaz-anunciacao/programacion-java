package org.example.forexercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario el número de número que va a introducir al programa
        System.out.println("Introduce la cantidad de números que introducirás al programa");
        int num = scanner.nextInt();
        scanner.nextLine();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < num; i++) {
            System.out.println("Introduce el " + (i+1) + "º número");
            int value = scanner.nextInt();
            scanner.nextLine();

            if (value > max) {
                max = value;
            }
        }
        System.out.println("El número mayor es: " + max);
    }
}
