package org.example.whileexercises;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // Llamamos al scanner
        Scanner scanner = new Scanner(System.in);

        int quantity = 0;
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        double aditionPositive = 0;
        double aditionNegative = 0;
        double aditionZeros = 0;

        while (quantity < 10){
            System.out.println("Introduce un número");
            int value = scanner.nextInt();
            scanner.nextLine();
            if (value > 0) {
                positive++;
                aditionPositive = aditionPositive + value;
            }
            else if (value < 0) {
                negative++;
                aditionNegative = aditionNegative + value;
            }
            else {
                zeros++;
                aditionZeros = aditionZeros + value;
            }
            quantity++;
        }

        double positiveAverage = aditionPositive / positive;
        double negativeAverage = aditionNegative / negative;

        System.out.println("Hay " + positive + " números positivos, " + negative + " números negativos y " + zeros + " ceros");
        System.out.println("La media de los número positivos es: " + positiveAverage);
        System.out.println("La media de los número negativos es: " + negativeAverage);
    }
}
