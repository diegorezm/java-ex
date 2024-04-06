import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Caixa {
    private List<Venda> vendas;
    private Estoque estoque;
    private final String[] operacoes = {"1: Listar", "2: Adicionar", "3: Remover", "4: Buscar", "5: Sair"};
    private final String[] operacoes_venda = {"1: Adicionar produto no carrinho",
            "2: Remover Produto do carrinho", "3: Listar produtos no carrinho", "4: Ver estoque", "5: Finalizar"};
    private final String[] operacoes_tipos = {"1: Estoque", "2: Vendas", "3: Sair"};

    public Caixa() {
        this.vendas = new ArrayList<>();
        this.estoque = new Estoque();
    }

    public Caixa(Estoque estoque) {
        this.vendas = new ArrayList<>();
        this.estoque = estoque;
    }

    private void printOperacoes() {
        System.out.println("----------------");
        for (String operacoe : this.operacoes) {
            System.out.println(operacoe);
        }
        System.out.println("----------------");
    }

    private void printOperacoes(String[] op) {
        System.out.println("----------------");
        for (String operacoe : op) {
            System.out.println(operacoe);
        }
        System.out.println("----------------");
    }

    private Venda getVendaById(String id) {
        return this.vendas.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    private void removeVendaById(String id) {
        this.vendas = this.vendas.stream().filter(e -> e.getId().equals(id)).collect(Collectors.toList());
    }

    private void venda(Scanner scanner, String cliente) {
        Venda venda = new Venda("1", cliente);
        boolean endloop = false;
        byte op;
        while (!endloop) {
            this.printOperacoes(this.operacoes_venda);
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    Produto produto = this.estoque.getProductByCodigo(codigo);
                    if (!Objects.isNull(produto)) {
                        venda.addProduct(produto);
                    }
                    break;
                }
                case 2: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    venda.removeProduct(codigo);
                    break;
                }
                case 3: {
                    List<Produto> produtos = venda.getProdutosComprados();
                    produtos.forEach(System.out::println);
                    System.out.println("Total: " + venda.calcTotalValue());
                    break;
                }
                case 4: {
                    System.out.println(this.estoque);
                    break;
                }
                case 5: {
                    System.out.println(venda.generateReceipt());
                    this.vendas.add(venda);
                    endloop = true;
                    break;
                }
                default: {
                    System.out.println("Por favor escolha uma operação valida (1-5). ");
                    break;
                }
            }
        }
    }


    private void vendasMng(Scanner scanner) {
        boolean endloop = false;
        byte op;
        while (!endloop) {
            this.printOperacoes();
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    this.vendas.forEach(Venda::generateReceipt);
                    break;
                }
                case 2: {
                    String nome;
                    System.out.print("Nome do cliente: ");
                    nome = scanner.next();
                    this.venda(scanner, nome);
                    break;
                }
                case 3: {
                    String id;
                    System.out.print("Id da venda: ");
                    id = scanner.next();
                    this.removeVendaById(id);
                    break;
                }
                case 4: {
                    String id;
                    System.out.print("Id da venda: ");
                    id = scanner.next();
                    Venda venda = this.getVendaById(id);
                    System.out.println(venda);
                    break;
                }
                case 5: {
                    endloop = true;
                    break;
                }
                default: {
                    System.out.println("Por favor escolha uma operação valida (1-5). ");
                    break;
                }
            }
        }
    }
    private void estoqueMng(Scanner scanner) {
        boolean endloop = false;
        byte op;
        while (!endloop) {
            this.printOperacoes();
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    System.out.println(this.estoque);
                    break;
                }
                case 2: {
                    String nome;
                    int codigo;
                    double preco;
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    System.out.print("Preco: ");
                    preco = scanner.nextDouble();
                    Produto produto = new Produto(nome, codigo, preco);
                    this.estoque.addProduct(produto);
                    break;
                }
                case 3: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    this.estoque.removeProduct(codigo);
                    break;
                }
                case 4: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    Produto produto = this.estoque.getProductByCodigo(codigo);
                    if (!Objects.isNull(produto)) {
                        System.out.println(produto);
                    }
                    break;
                }
                case 5: {
                    endloop = true;
                    break;
                }
                default: {
                    System.out.println("Por favor escolha uma operação valida (1-5). ");
                    break;
                }
            }
        }
    }

    public void run(Scanner scanner) {
        boolean endloop = false;
        byte op;
        while (!endloop) {
            this.printOperacoes(this.operacoes_tipos);
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    this.estoqueMng(scanner);
                    break;
                }
                case 2: {
                    this.vendasMng(scanner);
                    break;
                }
                case 3: {
                    endloop = true;
                    break;
                }
                default: {
                    System.out.println("Por favor escolha uma operação valida (1-5). ");
                    break;
                }
            }
        }
    }
}
