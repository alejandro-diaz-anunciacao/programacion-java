package org.example.whileexercises;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        int value = 1;
        int suma = 0;

        while (value != 0) {
            System.out.println("Introduce un número");
            value = scanner.nextInt();
            scanner.nextLine();

            suma = suma + value;
        }
        System.out.println("La suma de todos los números introducidos es de: " + suma);
    }
}
