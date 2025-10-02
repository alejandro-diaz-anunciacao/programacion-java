package org.example.switchexercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        // Llamamos al Scanner
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario un valor entero
        System.out.println("Introduzca un númer entero");
        int num = scanner.nextInt();

        switch (num) {
            case 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Buenos días");
                break;
            case 13, 14, 15, 16, 17, 18, 19, 20:
                System.out.println("Buenas tardes");
                break;
            case 21, 22, 23, 0, 1, 2, 3, 4, 5:
                System.out.println("Buenas noches");
                break;
            default:
                System.out.println("Hora inválida");
        }

    }
}
