package org.example.forexercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce un mensaje");
        String message = scanner.nextLine();

        for (int i = 0; i<num; i++){
            System.out.println(message);
        }
    }
}
