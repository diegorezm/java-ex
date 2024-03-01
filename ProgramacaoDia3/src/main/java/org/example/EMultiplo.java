package org.example;

import java.util.Scanner;

public class EMultiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Digite o primeiro numero: ");
        x = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = scanner.nextInt();
        System.out.println(x % y == 0 || y % x == 0 ? "São multiplos" : "Não são multiplos.");
    }
}
