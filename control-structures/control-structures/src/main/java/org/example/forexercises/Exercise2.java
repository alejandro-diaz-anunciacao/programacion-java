package org.example.forexercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce otro número entero");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        if (n1 > n2) {
            for (int i = n2; i <= n1; i++) {
                System.out.println(i);
            }
        }
        else if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
                System.out.println(i);
            }
        }

    }
}
