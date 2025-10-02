package org.example.whileexercises;

/* Escriba un programa que pida dos números enteros.
El programa pedirá de nuevo el segundo número hasta que sea mayor que el primero.
El programa terminará escribiendo los dos números.
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce otro número entero");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        while (n2<=n1) {
            System.out.println("NUMERO NO VÁLIDO EL SEGUNDO NÚMERO DEBE SER MAYOR");
            System.out.print("Introduce otro número entero");
            n2 = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Los números introducidos son : " + n1 + " y " + n2);

    }
}
