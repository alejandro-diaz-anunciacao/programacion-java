package org.example.variables;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca un número
        System.out.println("Introduce un número con decimales");
        // Guardamos el número en una variable
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        num1++;
        num1++;
        System.out.println("Su número incrementado es: " + num1);
    }
}
