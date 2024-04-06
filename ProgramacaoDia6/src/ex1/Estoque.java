package ex1;

import java.util.ArrayList;
import java.util.List;

public class Estoque <T extends Produto>{
    private List<T> estoque;
    public Estoque(List<T> estoque){
        this.estoque = estoque;
    }
    public Estoque(){
        this.estoque = new ArrayList<>();
    }
    public List<T> getEstoque() {
        return estoque;
    }
    public void setEstoque(List<T> estoque) {
        this.estoque = estoque;
    }

    public T getProdutoPorId(String id){
        return this.estoque
                .stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void removerProdutoPorId(String id){
        T produto = this.getProdutoPorId(id);
        if(produto != null){
            this.estoque.remove(produto);
        }
    }
    public void adicionarProduto(T produto){
        this.estoque.add(produto);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Produtos: ");
        this.estoque.forEach(e -> stringBuilder.append(e).append("\n\n"));
        return stringBuilder.toString();
    }
}
