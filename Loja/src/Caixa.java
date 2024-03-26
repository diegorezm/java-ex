import java.time.LocalDateTime;

public class Caixa {
    private Vendas vendas;

    public void iniciarVenda(String cliente, Estoque estoque) {
        this.vendas = new Vendas(LocalDateTime.now().toString(), cliente, estoque);
    }

    public void adicionarProdutoAvenda(Produto produto) {
        this.vendas.adcionarProdutoAvenda(produto);
    }

    public void removerProdutoAvenda(Integer codigo) {
        this.vendas.removerProdutoAvenda(codigo);
    }

    public String gerarRecibo() {
        return this.vendas.geraRecibo();
    }
}
