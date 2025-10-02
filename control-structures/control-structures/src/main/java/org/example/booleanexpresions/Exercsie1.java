package org.example.booleanexpresions;

import java.util.Scanner;

public class Exercsie1 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Introduce el segundo número");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        boolean maj = num1 >= num2;
        System.out.println("¿El número 1 es mayor o igual al número 2? "+ maj);

        boolean div = num1 % 2 == 0 && num2 >0;
        System.out.println("¿El primer número es divisible entre dos y el segundo número es mayor que cero? " + div);

        boolean x100 = num2 >= 100 * num1;
        System.out.println("¿El segundo número es 100 veces mayor que el primer número? " + x100);

        boolean positiveOrMinor = num1 > 0 || num2 > num1;
        System.out.println("¿El primer número es positivo o el segundo número es menor que el primer número? " + positiveOrMinor);


    }
}
