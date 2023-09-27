package imc;

import java.text.DecimalFormat;

public class Atleta extends Pessoa {
    private double peso, altura;

    public Atleta(String nome, String sobrenome,double peso, double altura) {
        super(nome,sobrenome);
        this.peso = peso;
        this.altura = altura;
    }

    public String getAltura() {
        return altura+" "+"m";
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso +" " + "kg";
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public double imc(){
        double imc =  peso / (altura * altura);
        return imc;
    }
    @Override
    public String toString() {
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        return super.toString() + "\nAltura: " + altura  + "\nPeso: " + peso + "\nimc: " + numberFormat.format(imc());
    }
}
