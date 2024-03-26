import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vendas {
    private String data;
    private String cliente;
    private List<Produto> produtosComprados;
    private double valorTotal;
    private Estoque estoque;

    public Vendas(String data, String cliente, Estoque estoque) {
        this.data = data;
        this.cliente = cliente;
        this.produtosComprados = new ArrayList<>();
        this.valorTotal = 0;
        this.estoque = estoque;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(List<Produto> produtosComprados) {
        this.produtosComprados = produtosComprados;
    }

    public void adcionarProdutoAvenda(Produto produtoParaComprar) {
        Produto produto = this.estoque.buscarProdutoPorCodigo(produtoParaComprar.getCodigo());
        if (produto != null) {
            this.produtosComprados.add(produtoParaComprar);
        }
    }

    public void removerProdutoAvenda(Integer codigo) {
        this.produtosComprados.stream().filter(e -> !e.getCodigo().equals(codigo)).collect(Collectors.toList());
    }

    public double calcularValorTotal() {
        this.produtosComprados.stream().forEach(e -> {
            this.valorTotal += e.getPreco();
        });
        return this.valorTotal;
    }

    public String geraRecibo() {
        StringBuilder stringBuilder = new StringBuilder("Recibo: \n");
        stringBuilder.append("Valor total: " + this.calcularValorTotal());
        stringBuilder.append("\nProdutos comprados: \n");
        this.produtosComprados.stream().forEach(e -> {
            stringBuilder.append("Codigo: " + e.getCodigo() + "\n");
        });

        return stringBuilder.toString();

    }
}
