import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Banco {
    private List<Conta> contas;
    private final String[] operacoes = {"1: Adicionar conta", "2: Remover conta", "3: Listar todas as contas",
            "4: Realizar transfêrencia",
            "5: Depositar",
            "6: Sacar",
            "7: Sair"};

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void novaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(String titular) {
        Conta conta = this.getContaPorTitular(titular);
        if (conta != null) {
            this.contas.remove(conta);
        }
    }

    public void removerConta(Integer numero) {
        Conta conta = this.getContaPorNumero(numero);
        if (conta != null) {
            this.contas.remove(conta);
        }
    }

    public Conta getContaPorTitular(String titular) {
        return this.contas.stream()
                .filter(e -> e.getTitular().equals(titular))
                .findFirst().orElse(null);
    }

    public Conta getContaPorNumero(Integer numero) {
        return this.contas.stream()
                .filter(e -> e.getNumero().equals(numero))
                .findFirst().orElse(null);
    }

    public String transferencia(Integer conta1, Integer conta2, double quantidade) {
        Conta cliente_1 = this.getContaPorNumero(conta1);
        Conta cliente_2 = this.getContaPorNumero(conta2);
        if (Objects.isNull(cliente_2) || Objects.isNull(cliente_1)) {
            return "Erro! conta não encontrada.";
        }
        boolean resultado = cliente_1.transferir(cliente_2, quantidade);
        if (!resultado) {
            return "Erro! Não foi possivel concluir a transferência";
        }
        return "Transferência realizada com sucesso!";
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
                case 1: {
                    int numero;
                    String titular;
                    System.out.print("Numero da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Nome do titular: ");
                    titular = scanner.next();
                    Conta conta = new Conta(numero, titular);
                    this.novaConta(conta);
                    break;
                }
                case 2: {
                    int numero;
                    System.out.print("Numero da conta que quer remover: ");
                    numero = scanner.nextInt();
                    this.removerConta(numero);
                    break;
                }
                case 3: {
                    System.out.println(this);
                    break;
                }
                case 4: {
                    int numero_1, numero_2;
                    double qt;
                    System.out.print("Numero da conta do remetente: ");
                    numero_1 = scanner.nextInt();
                    System.out.print("Numero da conta o destinatário: ");
                    numero_2 = scanner.nextInt();
                    System.out.print("Quantidade a ser transferida: ");
                    qt = scanner.nextDouble();
                    String resultado = this.transferencia(numero_1, numero_2, qt);
                    System.out.println(resultado);
                    break;
                }
                case 5:{
                    int numero;
                    double qt;
                    System.out.print("Numero da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    qt = scanner.nextDouble();
                    Conta conta = this.getContaPorNumero(numero);
                    conta.depositar(qt);
                    break;
                }
                case 6: {
                    int numero;
                    double qt;
                    System.out.print("Numero da conta: ");
                    numero = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    qt = scanner.nextDouble();
                    Conta conta = this.getContaPorNumero(numero);
                    conta.sacar(qt);
                    break;
                }
                case 7: {
                    terminar = true;
                    break;
                }
                default: {
                    System.out.print("Por favor escolha uma operação valida (1-5). ");
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Contas: \n");
        this.contas.forEach(e -> {
            stringBuilder.append("Titular: ").append(e.getTitular());
            stringBuilder.append("\nNumero: ").append(e.getNumero());
            stringBuilder.append("\nSaldo: ").append(e.getSaldo());
            stringBuilder.append("\n\n");
        });
        return stringBuilder.toString();
    }
}
