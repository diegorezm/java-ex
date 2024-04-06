import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Estoque {
    private List<Produto> produtos;
    private int quantidade;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void addProduct(Produto produto) {
        this.produtos.add(produto);
        this.quantidade += 1;
    }

    public void removeProduct(Integer codigo) {
        this.produtos = this.produtos.stream().filter(e -> e.getCodigo() != codigo).collect(Collectors.toList());
    }

    public Produto getProductByCodigo(Integer codigo) {
        return this.produtos.stream().filter(e -> e.getCodigo().equals(codigo)).findAny().orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Produtos: \n");
        this.produtos.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}

