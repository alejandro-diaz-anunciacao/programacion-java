package org.example.ifexercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Llamamos al Scanner
        Scanner scanner = new Scanner(System.in);

         System.out.println("Introduce el símbolo de la opereación");
         String operator = scanner.nextLine();

         if (operator.equals("+")) {
             System.out.println("Introduce un número");
             double a = scanner.nextDouble();
             scanner.nextLine();
             System.out.println("Introduce otro número");
             double b = scanner.nextDouble();
             scanner.nextLine();
             double res = a + b;
             System.out.println("El resultado de la operación es: " +  res);
         }
        else if (operator.equals("-")) {
            System.out.println("Introduce un número");
            double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduce otro número");
            double b = scanner.nextDouble();
            scanner.nextLine();
            double res = a - b;
            System.out.println("El resultado de la operación es: " +  res);
        }
        else if (operator.equals("/")) {
            System.out.println("Introduce un número");
            double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduce otro número");
            double b = scanner.nextDouble();
            scanner.nextLine();
            double res = a / b;
            System.out.println("El resultado de la operación es: " +  res);
        }
        else if (operator.equals("*")) {
            System.out.println("Introduce un número");
            double a = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Introduce otro número");
            double b = scanner.nextDouble();
            scanner.nextLine();
            double res = a * b;
            System.out.println("El resultado de la operación es: " +  res);
        }

         else {
             System.out.println("El operador no es válido");
         }
    }
}
