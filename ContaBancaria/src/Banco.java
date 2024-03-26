import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }

    public Banco() {
    }

    public void novaConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }
    public Conta getContaPorTitular(String titular) {
        return this.contas.stream()
                .filter(e -> e.getTitular().equals(titular))
                .findFirst().orElse(null);
    }
    public String transferencia(Conta cliente1, Conta cliente2, double quantidade){
        boolean transaferencia = cliente1.transferir(cliente2, quantidade);
        if(transaferencia){
            return "Transferido com sucesso!";
        }
        return "Erro na transferencia.";
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Contas: \n");
        this.contas.stream().forEach(e -> {
            stringBuilder.append("Titular: " + e.getTitular());
            stringBuilder.append("\nNumero: " + e.getNumero());
            stringBuilder.append("\nSaldo: " + e.getSaldo());
            stringBuilder.append("\n\n");
        });
        return stringBuilder.toString();
    }
}
