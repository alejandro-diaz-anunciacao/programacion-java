package org.example.ifexercises;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // Llamada al scanner
        Scanner scanner = new Scanner(System.in);

        // Petición de números
        System.out.println("Introduce un número");
        int num1 = scanner.nextInt();;
        scanner.nextLine();
        System.out.println("Introduce otro número");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        // Comparación
        if (num1 > num2) {
            System.out.println("Es mayor");
        }
        else if (num1 == num2) {
            System.out.println("Son iguales");
        }
        else {
            System.out.println("Es menor");
        }
    }
}
