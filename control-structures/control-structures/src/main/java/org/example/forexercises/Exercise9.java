package org.example.forexercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args){

        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero mayor a 1");
        int num = scanner.nextInt();
        scanner.nextLine();
        int searchPrimo = 2;
        boolean isPrime = true;

        if (num > 1) {
            for (int i = searchPrimo; i < num; i++) {
                if (num % searchPrimo != 0) {
                    System.out.print(num + " % " + searchPrimo + " == 0, ");
                    searchPrimo++;
                } else {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print("TODO FALSE: es primo");
            } else {
                System.out.print(num + " % " + searchPrimo + " == 0 TRUE -> NO ES PRIMO ");
            }
        } else {
            System.out.println("El número no es válido");
        }
    }
}
