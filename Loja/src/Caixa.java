import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Caixa {
    private List<Venda> vendas;
    private Estoque estoque;
    private final String[] operacoes = {"1: Listar", "2: Adicionar", "3: Remover", "4: Buscar", "5: Sair"};
    private final String[] operacoes_venda = {"1: Adicionar produto", "2: Remover Produto", "3: Produtos no carrinho","4: Ver estoque", "5: Finalizar"};
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

    private void removerVendaPorId(String id) {
        this.vendas = this.vendas.stream().filter(e -> e.getId().equals(id)).collect(Collectors.toList());
    }

    private void venda(Scanner scanner, String cliente) {
        Venda venda = new Venda("1", cliente);
        boolean terminar = false;
        byte op;
        while (!terminar) {
            this.printOperacoes(this.operacoes_venda);
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    Produto produto = this.estoque.buscarProdutoPorCodigo(codigo);
                    if (!Objects.isNull(produto)) {
                        venda.adcionarProdutoAvenda(produto);
                    }
                    break;
                }
                case 2: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    venda.removerProdutoAvenda(codigo);
                    break;
                }
                case 3: {
                    List<Produto> produtos = venda.getProdutosComprados();
                    produtos.forEach(System.out::println);
                    System.out.println("Total: " + venda.calcularValorTotal());
                    break;
                }
                case 4: {
                    System.out.println(this.estoque);
                    break;
                }
                case 5: {
                    System.out.println(venda);
                    this.vendas.add(venda);
                    terminar = true;
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
        boolean terminar = false;
        byte op;
        while (!terminar) {
            this.printOperacoes();
            System.out.print("Escolha uma operação: ");
            op = scanner.nextByte();
            switch (op) {
                case 1: {
                    this.vendas.forEach(System.out::println);
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
                    this.removerVendaPorId(id);
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
                    terminar = true;
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
        boolean terminar = false;
        byte op;
        while (!terminar) {
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
                    this.estoque.novoProduto(produto);
                    break;
                }
                case 3: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    this.estoque.removerProduto(codigo);
                    break;
                }
                case 4: {
                    int codigo;
                    System.out.print("Codigo: ");
                    codigo = scanner.nextInt();
                    Produto produto = this.estoque.buscarProdutoPorCodigo(codigo);
                    if (!Objects.isNull(produto)) {
                        System.out.println(produto);
                    }
                    break;
                }
                case 5: {
                    terminar = true;
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
        boolean terminar = false;
        byte op;
        while (!terminar) {
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
                    terminar = true;
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
