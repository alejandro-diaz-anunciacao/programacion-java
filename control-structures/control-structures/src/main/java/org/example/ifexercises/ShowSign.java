package org.example.ifexercises;

import java.util.Scanner;

public class ShowSign {
    public static void main(String[] args){
        // Llamamos al Scanner
        Scanner scanner = new Scanner(System.in);

        // Petición de número
        System.out.println("Introduzca un número enter");
        int num = scanner.nextInt();
        scanner.nextLine();

        // Procedemos a ver si el número es positivo, negativo o 0
        if (num > 0) {
            System.out.println("El número es positivo");
        }
        else if (num < 0) {
            System.out.println("El número es negativo");
        }
        else {
            System.out.println("El número no es ni positivo ni negativo, es 0");
        }
    }
}
