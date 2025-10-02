package org.example.forexercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo");
        int num = scanner.nextInt();
        scanner.nextLine();
        int sum = 0;

        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                sum = sum + i;
                System.out.println(i);
            }
            System.out.println("El resultado es: " + sum);
        }
        else {
            System.out.println("Número no válido");
        }

    }
}
