import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque;
        Scanner scanner = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
          produtos.add(new Produto("Product " + (i + 1), i * 100, 10.0 * (i + 1), 5));
        }
        estoque = new Estoque(produtos);
        Caixa caixa = new Caixa(estoque);
        caixa.run(scanner);
    }
}
