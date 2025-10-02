package org.example.booleanexpresions;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Introduce una respuesta: ");
        String answer = scanner.nextLine();

        boolean holaYMayor0 = answer.equals("Hola") && n > 0;
        System.out.println("¿La respuesta es Hola y el número es mayor que 0? " + holaYMayor0);


        boolean negativeOrN = n < 0 || !answer.equals("N");
        System.out.println("El número es negativo o la respuesto es distinto de N " + negativeOrN);

        boolean nNo0AndS = n != 0 && answer.equals("S");
        System.out.println("El número es distinto de 0 y la respuesta es S " + nNo0AndS);
    }
}
