package ex1;

import ex1.models.Alimento;
import ex1.models.Eletronico;
import ex1.models.Ferramenta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Alimento> alimentos = new ArrayList<>();
        alimentos.add(new Alimento("AL123", 5, "Maçã"));
        alimentos.add(new Alimento("AL456", 10, "Banana"));
        alimentos.add(new Alimento("AL789", 3, "Arroz"));

        ArrayList<Eletronico> eletronicos = new ArrayList<>();

        // Add elements to the list
        eletronicos.add(new Eletronico("EL101", 2, "TV 42\""));
        eletronicos.add(new Eletronico("EL202", 5, "Headset Gamer"));
        eletronicos.add(new Eletronico("EL303", 1, "Impressora Laser"));

        ArrayList<Ferramenta> ferramentas = new ArrayList<>();

        // Add elements to the list
        ferramentas.add(new Ferramenta("FR123", 3, "Martelo"));
        ferramentas.add(new Ferramenta("FR456", 10, "Chave de Fenda"));
        ferramentas.add(new Ferramenta("FR789", 2, "Serrote"));

        Estoque<Alimento> alimentoEstoque = new Estoque<>(alimentos);
        Estoque<Eletronico> eletronicoEstoque = new Estoque<>(eletronicos);
        Estoque<Ferramenta> ferramentaEstoque = new Estoque<>(ferramentas);

        String[] operations = {"1: Todos os produtos", "2: Adicionar produtos", "3: Remover produtos", "4: Sair"};
        String[] tipos = {"1: Alimento", "2: Eletronico", "3: Ferramenta"};
        int userInput;

        while (true) {
            Arrays.stream(operations).iterator().forEachRemaining(System.out::println);
            System.out.print("Qual a operação: (1-4)");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println("Listagem de qual tipo: ");
                    Arrays.stream(tipos).iterator().forEachRemaining(System.out::println);
                    userInput = scanner.nextInt();
                    switch (userInput) {
                        case 1 -> {
                            System.out.println(alimentoEstoque);
                        }
                        case 2 -> {
                            System.out.println(eletronicoEstoque);
                        }
                        case 3 -> {
                            System.out.println(ferramentaEstoque);
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Adicionar produto do tipo: ");
                    Arrays.stream(tipos).iterator().forEachRemaining(System.out::println);
                    userInput = scanner.nextInt();
                    String nome, id;
                    int qt;
                    System.out.println("Nome: ");
                    nome = scanner.next();
                    System.out.println("Id: ");
                    id = scanner.next();
                    System.out.println("Quantidade: ");
                    qt = scanner.nextInt();
                    switch (userInput) {
                        case 1 -> {
                            Alimento alimento = new Alimento(id,qt,nome);
                            alimentoEstoque.adicionarProduto(alimento);
                        }
                        case 2 -> {
                            Eletronico eletronico = new Eletronico(id,qt,nome);
                            eletronicoEstoque.adicionarProduto(eletronico);
                        }
                        case 3 -> {
                            Ferramenta novaFerramenta = new Ferramenta(id, qt, nome);
                            ferramentaEstoque.adicionarProduto(novaFerramenta);
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Remover produto do tipo: ");
                    Arrays.stream(tipos).iterator().forEachRemaining(System.out::println);
                    userInput = scanner.nextInt();
                    String id;
                    System.out.println("Diga o id: ");
                    id = scanner.next();
                    switch (userInput) {
                        case 1 -> {
                            alimentoEstoque.removerProdutoPorId(id);
                        }
                        case 2 -> {
                            eletronicoEstoque.removerProdutoPorId(id);
                        }
                        case 3 -> {
                            ferramentaEstoque.removerProdutoPorId(id);
                        }
                    }
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }
}
