package org.example;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte userNum;
        System.out.println("Diga um número: ");
        userNum = scanner.nextByte();
        for (int i = 0; i < userNum; i++) {
            if (i % 3 == 0) {
                System.out.println("Número impar: " + i);
            }
        }
    }
}
