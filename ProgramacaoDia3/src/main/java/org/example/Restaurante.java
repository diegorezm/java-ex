package org.example;

import java.util.Scanner;

public class Restaurante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userOrder;
        byte userQt;
        StringBuilder tabela = new StringBuilder("CODIGO\tESPECIFICAÇÃO\tPREÇO\n");
        tabela.append("1\tCachorro quente\tR$4,00\n");
        tabela.append("2\tX-SALADA\tR$4,50\n");
        tabela.append("3\tX-BACON\tR$5,00\n");
        tabela.append("4\tTorrada Simples\tR$2,00\n");
        tabela.append("5\tRefrigerante\tR$1,50\n");
        System.out.println(tabela);
        System.out.println("Forneça o codigo do item que gostaria de comprar: ");
        userOrder = scanner.next();
        System.out.println("Quantos de {} voce gostaria de compar: ");
        userQt = scanner.nextByte();
        float preco;
        switch (userOrder) {
            case "1":
                preco = 4;
                break;
            case "2":
                preco = 4.5F;
                break;
            case "3":
                preco = 5;
                break;
            case "4":
                preco = 2;
                break;
            case "5":
                preco = 1.5f;
                break;
            default:
                System.out.println("INVALIDO!");
                preco = -1;
                System.exit(1);
        }
        System.out.println("O valor a ser pago: R$" + preco * userQt);
    }
}
