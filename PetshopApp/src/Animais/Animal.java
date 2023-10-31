package Animais;

public abstract class Animal {

    protected int idade;
    protected float peso, tamanho;

    public Animal(int idade, float tamanho, float peso) {
        this.idade = idade;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public abstract String alimentacao();

    public abstract String som();

    public String dados() {
        return "Idade: " + idade  + " anos"+ "\nPeso: " + peso + " kg" + "\nTamanho:  " + tamanho +" cm"+ "\nAlimentação:  " + alimentacao() + "\nSom: " + som();
    }
}
