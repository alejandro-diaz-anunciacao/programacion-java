package org.example.ifexercises;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args){
        // LLamamos al scanner
        Scanner scanner = new Scanner(System.in);

        // Petición de número
        System.out.println("Introduzca un número");
        int num = scanner.nextInt();
        scanner.nextLine();

        // Procedemos a ver si el numero es par, impar o es 0
        if (num == 0) {
            System.out.println("El número no es ni par ni impar");
        }
        else if (num % 2 == 0){

            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }
}
