package org.example;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true) {
            System.out.println("Digite a senha: ");
            userInput = scanner.next();
            if(userInput.equals("2024")) break;
            System.out.println("Senha invalida, tente novamente.");
        }
        System.out.println("Sucesso!");
    }
}
