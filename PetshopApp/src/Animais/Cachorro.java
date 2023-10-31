package Animais;

public class Cachorro extends Animal {

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cachorro(String raca, int idade, float tamanho, float peso) {
        super(idade, tamanho, peso);
        this.raca = raca;
    }

    @Override
    public String alimentacao() {
        return "Ração";
    }

    @Override
    public String som() {
        return "Látido";
    }

    @Override
    public String dados() {
        return super.dados() + "\nRaça: " + raca;
    }

}
