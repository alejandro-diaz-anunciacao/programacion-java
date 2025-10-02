package org.example;

import java.util.Scanner;

public class StandardInputOutputProgram {
    public static void main(String[] args){
        // Creamos la utilidad scanner con la que después solicitamos datos al usuario
        Scanner scanner = new Scanner(System.in);
        // Mostramos por pantalla un mensaje para que el usuario sepa que debe introducir la edad
        System.out.println("Introduce tu edad...");
        String age = scanner.nextLine();
        System.out.println("Tienes " + age + " años");
    }
}