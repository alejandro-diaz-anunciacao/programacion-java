package org.example.switchexercises;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        // Llamamos al Scanner
        Scanner scanner = new Scanner(System.in);

        // Petición al usuario de una palabra con 8 caracteres
        System.out.println("Introduce un string con 8 caracteres");
        String word = scanner.nextLine();

        int wordLength = word.length();

        switch (wordLength){
            case 8:
                System.out.println("Es válido");
                break;
            default:
                System.out.println("No es válido");
        }
    }
}
