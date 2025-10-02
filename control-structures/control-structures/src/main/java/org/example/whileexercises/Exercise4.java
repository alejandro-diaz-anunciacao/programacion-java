package org.example.whileexercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {


        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número");
        int n = scanner.nextInt();
        scanner.nextLine();

        int quantity = 1;

        while (n>=0) {
            System.out.println("Introduce otro número");
            n = scanner.nextInt();
            scanner.nextLine();
            quantity++;
        }
        System.out.println("Has introducido " + quantity + " números.");
    }
}
