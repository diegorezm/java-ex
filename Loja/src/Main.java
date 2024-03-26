import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caixa caixa;
        Estoque estoque;
        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Caneta", 101, 2.50));
        produtos.add(new Produto("Lápis", 102, 1.00));
        produtos.add(new Produto("Caderno", 103, 15.00));
        produtos.add(new Produto("Mochila", 104, 50.00));
        produtos.add(new Produto("Borracha", 105, 3.00));
        produtos.add(new Produto("Compasso", 106, 8.00));
        produtos.add(new Produto("Apontador", 107, 2.00));
        produtos.add(new Produto("Tesoura", 108, 5.00));
        produtos.add(new Produto("Régua", 109, 2.00));
        produtos.add(new Produto("Cola", 110, 3.00));
        estoque = new Estoque(produtos);
        caixa = new Caixa();
        caixa.iniciarVenda("diego", estoque);
        caixa.adicionarProdutoAvenda(produtos.get(0));
        caixa.adicionarProdutoAvenda(produtos.get(1));
        System.out.println(caixa.gerarRecibo());
    }
}