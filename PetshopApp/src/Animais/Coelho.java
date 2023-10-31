package Animais;

public class Coelho extends Animal {

    public Coelho(int idade, float tamanho, float peso) {
        super(idade, tamanho, peso);
    }

    @Override
    public String alimentacao() {
        return "Alface";
    }

    @Override
    public String som() {
        return "Grunido";
    }
}
