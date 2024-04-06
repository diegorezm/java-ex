package ex1;

public abstract class Produto {
    private String id;
    private int quantidade;
    private String nome;

    public Produto(String id, int quantidade, String nome) {
        this.id = id;
        this.quantidade = quantidade;
        this.nome = nome;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionar() {
        this.quantidade += 1;
    }

    public void adicionar(int qt) {
        this.quantidade += qt;
    }

    public void remover() {
        this.quantidade -= 1;
    }

    public void remover(int qt) {
        this.quantidade -= qt;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + "\nNome: " + this.nome + "\nQuantidade: " + this.quantidade;
    }

}
