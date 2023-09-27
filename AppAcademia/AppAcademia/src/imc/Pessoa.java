package imc;
abstract public class Pessoa {
    private String nome, sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeCompleto(){
        return  nome + " " + sobrenome;

    }

    abstract double imc();
    @Override
    public String toString() {
        return "Nome: " + getNomeCompleto();
    }
}
