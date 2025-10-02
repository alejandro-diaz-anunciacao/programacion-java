package org.example.ifexercises;

import java.util.Scanner;

public class StringSizeCheck {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos un string de 8 caracteres
        System.out.println("Introduzca una palabra de caracteres");
        String word = scanner.nextLine();

        int wordLength = word.length();

        if (wordLength > 8) {
            System.out.println("Demasiado grande");
        }
        else if (wordLength < 8) {
            System.out.println("Demasiado pequeño");
        }
        else {
            System.out.println("Es válido");
        }
    }
}
