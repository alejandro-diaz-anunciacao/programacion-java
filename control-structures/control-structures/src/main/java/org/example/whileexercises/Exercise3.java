package org.example.whileexercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("¿Quieres seguir? (S/N)");
        String another = scanner.nextLine();

        int quantity = 1;

        while(another.equals("S") || another.equals("s")) {
            System.out.println("Introduce otro número");
            n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("¿Quieres seguir? (S/N)");
            another = scanner.nextLine();

            quantity++;
        }

        System.out.println("La cantidad de números introducidos han sido: " + quantity);

    }
}
