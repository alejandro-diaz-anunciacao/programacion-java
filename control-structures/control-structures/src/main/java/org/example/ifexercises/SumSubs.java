package org.example.ifexercises;

import java.util.Scanner;

public class SumSubs {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número entero");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduzca otro número entero");
        int b = scanner.nextInt();
        scanner.nextLine();

        if (a > b) {
            int res = a + b;
            System.out.println("El resultado es: " + res);
        }
        else if (a == b) {
            System.out.println("Introduzca un tercer número entero");
            int c = scanner.nextInt();
            scanner.nextLine();

            if (c > a+b) {
                System.out.println("c es mayor que a+b");
            }
            else if (c < a+b) {
                System.out.println("c es menor que a+b");
            }
            else {
                System.out.println("c es igual que a+b");
            }
        }
        else {
            int res = a - b;
            System.out.println("El resultado es: " + res);
        }
    }
}
