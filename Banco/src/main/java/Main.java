import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta(1,"diego"));
        contas.add(new Conta(2,"luana"));
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco(contas);
        banco.run(scanner);
    }
}