import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caixa caixa;
        Estoque estoque;
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
          produtos.add(new Produto("Product " + (i + 1), i * 100, 10.0 * (i + 1), 5));
      }
        estoque = new Estoque(produtos);
        caixa = new Caixa();
        caixa.iniciarVenda("diego", estoque);
        caixa.adicionarProdutoAvenda(produtos.get(0));
        caixa.adicionarProdutoAvenda(produtos.get(1));
        System.out.println(caixa.gerarRecibo());
        System.out.println(estoque);
    }
}
