package org.example.switchexercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // Llamamos al Scanner
        Scanner scanner = new Scanner(System.in);

         System.out.println("Introduce el símbolo de la opereación");
         String operator = scanner.nextLine();

         switch (operator) {
             case "+":
                 System.out.println("Introduce un número");
                 double num1 = scanner.nextDouble();
                 scanner.nextLine();
                 System.out.println("Introduce otro número");
                 double num2 = scanner.nextDouble();
                 scanner.nextLine();
                 double sum = num1 + num2;
                 System.out.println("El resultado de la operación es: " +  sum);
                 break;
             case "-":
                 System.out.println("Introduce un número");
                 double num3 = scanner.nextDouble();
                 scanner.nextLine();
                 System.out.println("Introduce otro número");
                 double num4 = scanner.nextDouble();
                 scanner.nextLine();
                 double res = num3 - num4;
                 System.out.println("El resultado de la operación es: " +  res);
                 break;
             case "*":
                 System.out.println("Introduce un número");
                 double num5 = scanner.nextDouble();
                 scanner.nextLine();
                 System.out.println("Introduce otro número");
                 double num6 = scanner.nextDouble();
                 scanner.nextLine();
                 double div = num5 * num6;
                 System.out.println("El resultado de la operación es: " +  div);
                 break;
             case "/":
                 System.out.println("Introduce un número");
                 double num7 = scanner.nextDouble();
                 scanner.nextLine();
                 System.out.println("Introduce otro número");
                 double num8 = scanner.nextDouble();
                 scanner.nextLine();
                 double mult = num7 / num8;
                 System.out.println("El resultado de la operación es: " +  mult);
                 break;
             default:
                 System.out.println("Operador inválido");
         }

    }
}
