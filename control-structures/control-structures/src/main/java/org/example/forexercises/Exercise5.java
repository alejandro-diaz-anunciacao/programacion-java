package org.example.forexercises;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un año");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce otro año");
        int year2 = scanner.nextInt();
        scanner.nextLine();

        if (year1 > year2) {
            for (int i = year2; i <= year1; i++) {
                if (i % 4 == 0 && i % 100 != 0) {
                    System.out.println(i);
                }
            }
        }
        else {
            for (int i = year1; i <= year2; i++) {
                if (i % 4 == 0 && (i % 100 != 0 || i % 400 ==0)) {
                    System.out.println(i);
                }
            }
        }
    }
}
