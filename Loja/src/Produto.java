public class Produto {
  private String nome;
  private Integer codigo;
  private Double preco;
  private int quantidade;

  public Produto(String nome, Integer codigo, Double preco, int quantidade) {
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getCodigo() {
    return codigo;
  }

  public void setCodigo(Integer codigo) {
    this.codigo = codigo;
  }

  public Double getPreco() {
    return preco;
  }

  public void setPreco(Double preco) {
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }
  public void adicionarQuantidade(int quantidade){
    this.quantidade += quantidade;
  }
  
  public void adicionarQuantidade(){
    this.quantidade += 1;  
  }
  public void removerQuantidade(int quantidade) {
    this.quantidade -= quantidade;
  }
  public void removerQuantidade(){
    this.quantidade -= 1;
  }
}

