import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    Integer matricula;
    String curso;
    List<Double> notas;

    public Aluno(String nome, Integer matricula, String curso, List<Double> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }
    public Aluno(String nome, Integer matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public double media(){
        double media = this.notas.stream().reduce(0.00, (el1,el2) -> el1 + el2);
        return media / this.notas.size();
    }

    public boolean aprovado(){
        if(this.media() >= 6) return true;
        return false;
    }
}
