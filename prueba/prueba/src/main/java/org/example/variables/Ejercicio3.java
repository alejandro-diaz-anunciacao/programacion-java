package org.example.variables;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos a realizar una multiplicación");
        // Pedimos al usuario que introduzca el primer número
        System.out.println("Introduce el primer número:");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        // Pedimos al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        //Realizamos la multiplicación y la mostramos por pantalla
        double res = num1 * num2;
        System.out.println("El resultado de la multiplicación es: " + res);
    }
}
