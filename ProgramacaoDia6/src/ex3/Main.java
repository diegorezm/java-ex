package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoInventario gerenciamentoInventario = new GerenciamentoInventario();
        gerenciamentoInventario.run(scanner);
    }
}
