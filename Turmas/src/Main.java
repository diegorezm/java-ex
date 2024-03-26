import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Alice Silva", 12345, "Ciência da Computação", new ArrayList<>(List.of(8.5, 7.2, 9.1))));
        alunos.add(new Aluno("Bob Santos", 54321, "Matemática", new ArrayList<>(List.of(7.8, 9.0, 6.5))));
        alunos.add(new Aluno("Charlie Souza", 98765, "Engenharia", new ArrayList<>(List.of(9.5, 8.8, 10.0))));
        Turmas turmas = new Turmas(alunos);
        System.out.println(turmas);
        List<String> operacoes = new ArrayList<>();

        operacoes.add("1: Adicionar aluno");
        operacoes.add("2: Remover aluno");
        operacoes.add("3: Listar todos os alunos");
        operacoes.add("4: Media do aluno");
        operacoes.add("5: Sair");

        boolean terminar = false;
        byte op;
        while (!terminar) {
            System.out.println("-------------------------");
            operacoes.stream().forEach(System.out::println);
            System.out.println("-------------------------");
            System.out.print("Escolha uma operação: (numero) ");
            op = scanner.nextByte();
            switch (op) {
                case 1:
                    String nome;
                    Integer matricula;
                    String curso;
                    List<Double> notas = new ArrayList<>();
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    System.out.print("\nMatricula: ");
                    matricula = scanner.nextInt();
                    System.out.print("\nCurso: ");
                    curso = scanner.next();
                    System.out.println();
                    for (int i = 0; i <3;
                    i++){
                       System.out.print("Diga a " + (i + 1) + " nota: ");
                       notas.add(scanner.nextDouble());
                }
                    Aluno aluno = new Aluno(nome,matricula,curso,notas);
                    turmas.novoAluno(aluno);
                break;
                case 2:
                    Integer m;
                    System.out.print("Diga a matricula do aluno que quer remover: ");
                    m = scanner.nextInt();
                    turmas.removerAluno(m);
                    System.out.println("Aluno removido com sucesso!");
                    break;
                case 3:
                    System.out.print(turmas);
                    break;
                case 4:
                    Integer t;
                    System.out.print("Diga a matricula do aluno que quer remover: ");
                    t = scanner.nextInt();
                    Aluno aluno1 = turmas.getAlunoPorMatricula(t);
                    System.out.println("A media deste alun é: " + aluno1.media());
                    System.out.println(aluno1.aprovado() ? "Este aluno está aprovado!" : "Este aluno foi reprovado.");
                    break;
                case 5:
                    terminar = true;
                default:
                    System.out.print("Por favor escolha uma operação valida (1-5). ");
            }
        }
        System.exit(0);
    }

}