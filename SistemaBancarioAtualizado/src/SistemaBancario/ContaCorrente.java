package SistemaBancario;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class ContaCorrente {

    protected String numero;
    protected Pessoa titular;
    protected LocalDate dataAbertura;
    protected double saldo;

    //CONSTRUTOR
    public ContaCorrente(String nConta,
            Pessoa titular,
            LocalDate dataAbertura) {

        numero = nConta;
        this.titular = titular;
        this.dataAbertura = dataAbertura;
        saldo = 0;
    }

    //METODOS DE ACESSO
    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public boolean sacar(double valorSaque) {
        if (getSaldo() >= valorSaque) {
            saldo -= valorSaque;
            return true;
        }
        return false;
    }//fim do método sacar

    @Override
    public String toString() {
        DateTimeFormatter mascaraData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dados
                = "Cliente desde " + mascaraData.format(dataAbertura)
                + "\nConta Nº " + getNumero()
                + "\nTitular = " + getTitular().nomeCompleto()+" - CPF nº "+titular.getCpf()
                + "\nSaldo disponível = " + getSaldo();
        return dados;
    } // fim metodo toString
}
