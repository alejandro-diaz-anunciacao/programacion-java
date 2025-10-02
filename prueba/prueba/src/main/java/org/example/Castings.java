package org.example;

import java.util.Scanner;

public class Castings {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        long n1 = n;

        System.out.println(n1);
        double other = scanner.nextDouble();
        scanner.nextLine();

        int otherInt = (int) other;
        System.out.println(otherInt);

    }
}
