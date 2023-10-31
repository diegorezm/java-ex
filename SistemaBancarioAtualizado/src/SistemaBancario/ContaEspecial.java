package SistemaBancario;

import java.time.LocalDate;

public class ContaEspecial extends ContaCorrente {

    //ATRIBUTOS
    private double limite;

    public ContaEspecial(String nConta, Pessoa titular, LocalDate dataAbertura) {
        super(nConta, titular, dataAbertura);
        limite = 1000;
    }

    public ContaEspecial(String nConta, Pessoa titular, LocalDate dataAbertura, double limite) {
        super(nConta, titular, dataAbertura);
        this.limite = limite;
    }

    //METODOS DE ACESSO
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo() + limite;
    }//fim do método saldoDisponivel

 
    @Override
    public String toString() {
        String dados = super.toString()
                + "\nLimite R$ " + getLimite()
                + "\nSaldo real R$ " + super.getSaldo();
        return dados;
    } // fim metodo toString
}
