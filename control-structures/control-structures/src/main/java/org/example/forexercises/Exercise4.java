package org.example.forexercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo");
        int num = scanner.nextInt();
        scanner.nextLine();
        int factorial = 1;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
                System.out.println(i);
            }
            System.out.println("El resultado es: " + factorial);
        }
        else {
            System.out.println("El número no es válido");
        }
    }
}
