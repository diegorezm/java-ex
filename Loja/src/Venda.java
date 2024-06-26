import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Venda {
    private final String id;
    private String data;
    private String cliente;
    private List<Produto> produtosComprados;
    private double valorTotal;

    public Venda(String id, String cliente) {
        this.id = id;
        this.data = LocalDateTime.now().toString();
        this.cliente = cliente;
        this.produtosComprados = new ArrayList<>();
        this.valorTotal = 0;
    }

    public String getId() {
        return this.id;
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

    public void addProduct(Produto produto) {
        if (produto.getQuantidade() > 0) {
            this.produtosComprados.add(produto);
        }
    }

    public void removeProduct(int codigo) {
        this.produtosComprados = this.produtosComprados
                .stream()
                .filter(e -> !e.getCodigo().equals(codigo))
                .collect(Collectors.toList());
    }

    public double calcTotalValue() {
        double valor = 0;
        for (Produto produtosComprado : this.produtosComprados) {
            valor += produtosComprado.getPreco();
        }
        return valor;
    }
    private void prepareReceipt() {
        this.produtosComprados.forEach(Produto::removerQuantidade);
        this.valorTotal = this.calcTotalValue();
    }

    public String generateReceipt() {
        StringBuilder stringBuilder = new StringBuilder("Recibo: \n");
        this.prepareReceipt();
        stringBuilder.append(this);
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Valor total: ").append(this.valorTotal);
        stringBuilder.append("\nProdutos comprados: \n");
        this.produtosComprados.forEach(e -> {
            stringBuilder.append("\t- Codigo: ").append(e.getCodigo()).append("\n");
        });
        return stringBuilder.toString();
    }
}

