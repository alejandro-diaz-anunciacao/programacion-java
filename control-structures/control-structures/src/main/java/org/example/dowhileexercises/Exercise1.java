package org.example.dowhileexercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        String name = "";

        do {
            System.out.println("1 Saluda ");
            System.out.println("2 Grita ");
            System.out.println("3 Salir ");

            System.out.println("Elige una opción");
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.println("Introduzca su nombre");
                name = scanner.nextLine();
                System.out.println("Hola, " + name);
                System.out.println("");

            }
            else if (input == 2) {
                System.out.println("Introduzca su nombre");
                name = scanner.nextLine();
                System.out.println("Cuidado " + name + "!");
                System.out.println("");
            }
            else {
                System.out.println("Número incorrecto");
            }
        } while (input != 3 );

        System.out.println("Programa finalizado.");
    }
}
