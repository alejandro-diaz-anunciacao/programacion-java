package org.example.variables;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario el primer número a comparar
        System.out.println("Introduce el primer número a comparar");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        // Pedimos al usuario el segundo número a comparar
        System.out.println("Introduce el segundo número a comparar");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        // Comparamos los dos números para comprobar si son iguales y mostramos en pantalla si lo es o no
        boolean areNotEquals = num1 != num2;
        System.out.println("¿No son iguales?");
        System.out.println(areNotEquals);
    }
}
