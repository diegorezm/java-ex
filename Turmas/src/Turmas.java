import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turmas {
    private List<Aluno> alunos;
    private final String[] operacoes = {"1: Adicionar aluno", "2: Remover aluno", "3: Listar todos os alunos", "4: Media do aluno", "5: Sair"};

    public Turmas(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public Turmas() {
        this.alunos = new ArrayList<>();
    }


    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void novoAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removerAluno(int matricula) {
        Aluno aluno = this.getAlunoPorMatricula(matricula);
        if (aluno != null) {
            this.alunos.remove(aluno);
        }
    }

    public Aluno getAlunoPorMatricula(int matricula) {
        return this.alunos.stream().filter(e -> e.matricula.equals(matricula)).findFirst().orElse(null);
    }

    public void run(Scanner scanner) {
        boolean terminar = false;
        byte op;
        while (!terminar) {
            System.out.println("-------------------------");
            for (String operacoe : this.operacoes) {
               System.out.println(operacoe);
            }
            System.out.println("-------------------------");
            System.out.print("Escolha uma operação: (numero) ");
            op = scanner.nextByte();
            switch (op) {
                case 1:
                    String nome;
                    int matricula;
                    String curso;
                    List<Double> notas = new ArrayList<>();
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    System.out.print("\nMatricula: ");
                    matricula = scanner.nextInt();
                    System.out.print("\nCurso: ");
                    curso = scanner.next();
                    for (int i = 0; i < 3;
                         i++) {
                        System.out.print("Diga a " + (i + 1) + " nota: ");
                        notas.add(scanner.nextDouble());
                    }
                    Aluno aluno = new Aluno(nome, matricula, curso, notas);
                    this.novoAluno(aluno);
                    break;
                case 2:
                    int m;
                    System.out.print("Diga a matricula do aluno que quer remover: ");
                    m = scanner.nextInt();
                    this.removerAluno(m);
                    System.out.println("Aluno removido com sucesso!");
                    break;
                case 3:
                    System.out.println(this);
                    break;
                case 4:
                    int t;
                    System.out.print("Diga a matricula do aluno: ");
                    t = scanner.nextInt();
                    Aluno aluno1 = this.getAlunoPorMatricula(t);
                    System.out.println("A media deste alun é: " + aluno1.media());
                    System.out.println(aluno1.aprovado() ? "Este aluno está aprovado!" : "Este aluno foi reprovado.");
                    break;
                case 5:
                    terminar = true;
                    break;
                default:
                    System.out.print("Por favor escolha uma operação valida (1-5). ");
                    break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Alunos: \n");
        this.alunos.forEach(e -> {
            stringBuilder.append("Nome: ").append(e.getNome());
            stringBuilder.append("\nCurso: ").append(e.getCurso());
            stringBuilder.append("\nMatricula: ").append(e.getMatricula());
            stringBuilder.append("\n\n");
        });
        return stringBuilder.toString();
    }
}
