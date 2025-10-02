package org.example.whileexercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        //Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce cuantos números vas a introducir");
        double inputs = scanner.nextDouble();
        scanner.nextLine();

        double suma = 0;

        for (int i = 0; i < inputs; i++) {
            System.out.println("Introduce un número");
            double value = scanner.nextDouble();
            scanner.nextLine();

            while (value < 1) {
                System.out.println("Número no válido, introduce otro número");
                value = scanner.nextDouble();
                scanner.nextLine();
            }

            suma = suma + value;

        }
        double media = suma / inputs;
        System.out.println("La media entre los números introducidos es de: " + media);
    }
}
