import java.util.Objects;

public class Conta {
    private Integer numero;
    private String titular;
    private Double saldo;

    public Conta(Integer numero, String titular, Double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double quantidade) {
        if (quantidade > saldo) {
            return false;
        }
        this.saldo -= quantidade;
        return true;
    }

    public boolean depositar(double quantidade) {
        this.saldo += quantidade;
        return true;
    }

    public boolean transferir(Conta cliente, double quantiade) {
        if (!this.sacar(quantiade)) {
            return false;
        }
        cliente.depositar(quantiade);
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.titular);
    }
}
