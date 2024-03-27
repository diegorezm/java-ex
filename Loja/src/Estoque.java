import java.util.List;
import java.util.stream.Collectors;

public class Estoque {
    private List<Produto> produtos;
    private int quantidade;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public int getQuantidade(){
      return this.quantidade;
    }
  
  public void novoProduto(Produto produto){
        this.produtos.add(produto);
        this.quantidade += 1;
    }
    public void removerProduto(Integer codigo){
        this.produtos.stream().filter(e -> e.getCodigo() != codigo).collect(Collectors.toList());
    }
    public Produto buscarProdutoPorCodigo(Integer codigo){
        Produto produto = this.produtos.stream().filter(e -> e.getCodigo().equals(codigo)).findAny().orElse(null);
        return produto;
    }

  
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Produtos: \n");
        this.produtos.stream().forEach(e -> {
            stringBuilder.append("Nome: " + e.getNome());
            stringBuilder.append("\nCodigo: " + e.getCodigo());
            stringBuilder.append("\nPreço: " + e.getPreco());
            stringBuilder.append("\nQuantidade: " + e.getQuantidade());
            stringBuilder.append("\n\n");
        });
        return stringBuilder.toString();
    }
}

