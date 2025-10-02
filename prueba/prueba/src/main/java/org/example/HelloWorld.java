package org.example;

public class HelloWorld {
    public static void main(String[] args){
        // Muestra por pantalla hola mundo
        System.out.println("Hola mundo, que tal");
        // Muestra por pantalla adiós
        System.out.println("Adiós");

        System.out.println("Otra más");

        int myNumber = 4;
        System.out.println(myNumber);

        myNumber = 5;
        System.out.println(myNumber);

        char myChar = 'a';
        System.out.println(myChar);

        double myDouble = 3.4455;
        System.out.println(myDouble);

        byte myByte = 1;
        System.out.println(myByte);

        double secondNumber = 100000000.0000000000000000001d;

        double otherNumber = 10000000000000000d;

        double res = secondNumber - otherNumber;
        System.out.println(res);

        boolean myBolean = true;
        System.out.println(myBolean);

        double n1 = 3;
        double n2 = 5;

        n1++;
        n1++;
        System.out.println(n1);

        double n3 = n1/n2;
        System.out.println(n3);

        boolean isEqual = n1 == n2;
        System.out.println(isEqual);
    }
}
