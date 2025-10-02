package org.example.forexercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la cantidad de número que introducirás en el programa");
        int num = scanner.nextInt();
        scanner.nextLine();

        int negative = 0;

        for(int i = 0; i < num; i++) {
            System.out.println("Introduce el " + (i+1) + "º número");
            int value = scanner.nextInt();
            scanner.nextLine();
            if (value < 0) {
                negative++;
            }
        }
        System.out.println("Hay " + negative + " números negativos");

    }
}
