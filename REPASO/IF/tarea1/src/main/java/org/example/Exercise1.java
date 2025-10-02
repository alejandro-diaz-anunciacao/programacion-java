package org.example;

// Espero que este el ejercicio perfecto :)

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do { // Creamos un do donde repetiremos las acciones hasta que el valor de option sea 0
            int n = 0;
            double suma = 0;
            double value = 0;
            double res = 0;

            System.out.println("1. Repite mensaje");
            System.out.println("2. Media");
            System.out.println("3. Salir");
            System.out.println("");

            System.out.println("Digite un número para continuar");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) { //
                do {
                    System.out.println("Introduce un número entero positivo");
                    n =  scanner.nextInt();
                    scanner.nextLine();
                } while (n <= 0);
                System.out.println("Introduce un mensaje de texto");
                String message =  scanner.nextLine();
                System.out.println(""); // Agregar una línea de espacio para mejor visualización en la terminal

                for (int i = 0; i < n; i++) {
                    System.out.println(message);
                }
                System.out.println("");
            } else if (option == 2) {
                do {
                    System.out.println("¿Cuantos números va a introducir?");
                    n =   scanner.nextInt();
                    scanner.nextLine();
                } while (n <= 0);
                for (int  i = 0; i < n; i++) {
                    System.out.println("Introduce un número");
                    value = scanner.nextInt();
                    scanner.nextLine();

                    suma = suma + value;
                }
                res = suma / n;
                System.out.println("La media de los números introducidos es de: " + res);
                System.out.println("");
            }

        } while (option != 3);
        System.out.println("Program exit");
    }
}
