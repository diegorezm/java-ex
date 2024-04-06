package ex2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SistemaInscricao {
    private Set<Participante> participantes;
    private final String[] operacoes = {"1: Listar participantes", "2: adicionar participante", "3: remover participante",
            "4: sair"};

    public SistemaInscricao(Set<Participante> participantes) {
        this.participantes = participantes;
    }
    public SistemaInscricao(){
        this.participantes = new HashSet<>();
    }


    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public void adcionar(Participante participante) {
        this.participantes.add(participante);
    }

    public void removerPorId(String id) {
        Participante participante = this.getParticipantePorId(id);
        if (participante != null) this.participantes.remove(participante);
    }

    public Participante getParticipantePorId(String id) {
        return this.participantes.stream().filter(e -> e.getId().equals(id)).findFirst().orElse(null);
    }

    public void run(Scanner scanner) {
        int userInput = 1;
        while (true) {
            Arrays.stream(this.operacoes).forEach(System.out::println);
            System.out.println("Escolha uma operação: (1-4)");
            userInput = scanner.nextInt();
            switch (userInput) {
                case 1 -> {
                    System.out.println(this);
                }
                case 2 -> {
                    String id,nome;
                    System.out.print("Nome: ");
                    nome = scanner.next();
                    System.out.print("id: ");
                    id = scanner.next();
                    Participante participante = new Participante(id,nome);
                    this.adcionar(participante);
                }
                case 3 -> {
                    String id;
                    System.out.print("id: ");
                    id = scanner.next();
                    this.removerPorId(id);
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }

        @Override
        public String toString () {
            StringBuilder stringBuilder = new StringBuilder("Participantes: \n");
            this.participantes.forEach(e -> stringBuilder.append(e).append("\n\n"));
            return stringBuilder.toString();
        }
    }
