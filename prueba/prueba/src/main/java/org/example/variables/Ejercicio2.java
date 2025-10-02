package org.example.variables;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que introduzca el numerador
        System.out.println("Introduce el numerador:");
        double numerador = scanner.nextDouble();
        scanner.nextLine();
        // Pedimos al usuario que introduzca el numerador
        System.out.println("Introduce el denominador:");
        double denominador = scanner.nextDouble();
        scanner.nextLine();

        // Realizamos la división entre ambos números
        double res = numerador / denominador;
        // Mostramos en pantalla el resultado
        System.out.println("Su resultado es: " + res);

    }
}
