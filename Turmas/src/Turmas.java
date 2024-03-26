import java.util.List;

public class Turmas {
    List<Aluno> alunos;

    public Turmas(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public void novoAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    public void removerAluno(int matricula){
        Aluno aluno = this.getAlunoPorMatricula(matricula);
        if(aluno != null) {
            this.alunos.remove(aluno);
        }
    }
    public Aluno getAlunoPorMatricula(int matricula){
        return this.alunos.stream().filter(e -> e.matricula.equals(matricula)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Alunos: \n");
        this.alunos.stream().forEach(e -> {
            stringBuilder.append("Nome: " + e.getNome());
            stringBuilder.append("\nCurso: " + e.getCurso());
            stringBuilder.append("\nMatricula: " + e.getMatricula());
            stringBuilder.append("\n\n");
        });
        return stringBuilder.toString();
    }
}
