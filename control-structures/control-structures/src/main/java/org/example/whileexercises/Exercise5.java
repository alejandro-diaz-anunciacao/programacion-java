package org.example.whileexercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int secret = r.nextInt(100);
        int n = -1;

        while (n != secret) {
            System.out.print("Introduce un número entre 1 y 100: ");
            n = scanner.nextInt();

            if (n > secret) {
                System.out.println("El número a adivinar es menor.");
            } else if (n < secret) {
                System.out.println("El número a adivinar es mayor.");
            }
        }

        System.out.println("¡GENIAL! Has acertado el número :)");
    }
}
