package org.example.whileexercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número");
        double n1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Introduzca otro número");
        double n2 = scanner.nextDouble();
        scanner.nextLine();

        while (n1<n2) {
            System.out.println("El número es demasiado grande. ");
            System.out.println("Introduce un número menor que el primer número introducido.");
            n2 = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("Los números introducidos son: " + n1 + " y " + n2);
    }
}
