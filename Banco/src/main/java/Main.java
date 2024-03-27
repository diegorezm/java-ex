import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(12345, "Diego", 0.00));
        contas.add(new Conta(54321, "Maria", 500.00));
        contas.add(new Conta(98765, "Jose", 0.00));
        Banco banco = new Banco(contas);
        Conta c1 = banco.getContaPorTitular(contas.get(0).getTitular());
        Conta c2 = banco.getContaPorTitular(contas.get(2).getTitular());
        Conta c3 = banco.getContaPorNumero(contas.get(1).getNumero());
        c1.depositar(20);
        System.out.println(banco.transferencia(c1,c2,20));
        banco.removerConta(c3.getTitular());
        System.out.println(banco);
    }
}