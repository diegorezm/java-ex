
package SistemaBancario;

public class Pessoa {
      //Atributos
    private String nome;
    private String sobrenome;
    private String cpf;

    //CONSTRUTOR
    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    
    //METODOS DE ACESSO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    //METODOS GERAIS
    public String nomeCompleto(){
        return nome+" "+sobrenome;
    }
 
}
