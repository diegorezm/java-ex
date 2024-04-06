package ex3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GerenciamentoInventario {
    private Map<String, Integer> estoque;
    private Map<String, Integer> vendas;
    private final String[] operations = {"1: Listar", "2: Adicionar produto", "3: Atualizar", "4: Remover", "4: Sair"};
    private final String[] tipos = {"1: Vendas", "2: Compras"};

    public GerenciamentoInventario() {
        this.estoque = new HashMap<>();
        this.vendas = new HashMap<>();
    }

    public GerenciamentoInventario(Map<String, Integer> estoque) {
        this.estoque = estoque;
    }

    public Map<String, Integer> getProdutos() {
        return estoque;
    }

    public void setProdutos(Map<String, Integer> produtos) {
        this.estoque = produtos;
    }

    public Map<String, Integer> getVendas() {
        return vendas;
    }

    public void setVendas(Map<String, Integer> vendas) {
        this.vendas = vendas;
    }

    public void adicionarProdutoNoEstoque(Produto produto, int qt) {
        this.estoque.put(produto.getId(), qt);
        this.vendas.put(produto.getId(), 0);
    }

    public void adicionarProdutoNoEstoque(Produto produto) {
        this.estoque.put(produto.getId(), 0);
        this.vendas.put(produto.getId(), 0);
    }

    public void removerProduto(String id) {
        this.estoque.remove(id);
        this.vendas.remove(id);
    }

    public void atualizarEstoque(String id, int qt) {
        this.estoque.put(id, qt);
    }

    public void atualizarEstoque(String id) {
        this.estoque.put(id, this.estoque.get(id) + 1);
    }

    public void adicionarVenda(String id) {
        this.vendas.put(id, this.vendas.get(id) + 1);
        this.estoque.put(id, this.estoque.get(id) - 1);
    }

    public String relatorioVendas() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.vendas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stringBuilder.append("id: ").append(key).append("vendas: ").append(value);
        }
        return stringBuilder.toString();
    }

    public String relatorioEstoque() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Integer> entry : this.estoque.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            stringBuilder.append("id: ").append(key).append("estoque: ").append(value);
        }
        return stringBuilder.toString();
    }

    public void run(Scanner scanner) {
        while (true) {
            Arrays.stream(this.operations).iterator().forEachRemaining(System.out::println);
            int userInput = 1;
            System.out.print("operação: (1-4) ");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> {
                    Arrays.stream(this.tipos).iterator().forEachRemaining(System.out::println);
                    System.out.print("tipo: (1-2) ");
                    userInput = scanner.nextInt();
                    switch (userInput) {
                        case 1 -> {
                            System.out.println(this.relatorioVendas());
                        }
                        case 2 -> {
                            System.out.println(this.relatorioEstoque());
                        }
                    }
                }
                case 2 -> {
                    String id, nome;
                    System.out.print("id: ");
                    id = scanner.next();
                    System.out.print("nome: ");
                    nome = scanner.next();
                    Produto novoProduto = new Produto(id, nome);
                    this.adicionarProdutoNoEstoque(novoProduto);
                }
                case 3 -> {
                    Arrays.stream(this.tipos).iterator().forEachRemaining(System.out::println);
                    System.out.print("tipo: (1-2) ");
                    userInput = scanner.nextInt();
                    switch (userInput) {
                        case 1 -> {
                            String id;
                            System.out.print("id do produto: ");
                            id = scanner.next();
                            this.adicionarVenda(id);
                        }
                        case 2 -> {
                            String id;
                            System.out.println("id: ");
                            id = scanner.next();
                            int op;
                            System.out.println("Gostaria de atualizar a quantidade (1) ou apenas aumentar (2): ");
                            op = scanner.nextInt();
                            if (op == 1) {
                                int qt;
                                System.out.print("Quantidade: ");
                                qt = scanner.nextInt();
                                this.atualizarEstoque(id, qt);
                            } else if (op == 2) {
                                this.atualizarEstoque(id);
                            }
                        }
                    }
                }
                case 4 -> {
                    String id;
                    System.out.println("id do produto: ");
                    id = scanner.next();
                    this.removerProduto(id);
                }
                case 5 -> {
                    System.exit(0);
                }
            }
        }
    }
}
