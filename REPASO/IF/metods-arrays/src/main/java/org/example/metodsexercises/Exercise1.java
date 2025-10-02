package org.example.metodsexercises;

// Crear un metodo que calcule la suma de sus parámetros enteros y devuelva el resultado

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("El resultado es: " + parametersAdition());
    }

    public static int parametersAdition() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int n1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce el segundo número");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        int suma = n1 + n2;
        return suma;
    }
}



