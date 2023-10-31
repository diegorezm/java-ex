package Animais;

public class BemTeVi extends Animal {

   public BemTeVi(int idade, float tamanho, float peso) {
        super(idade, tamanho, peso);
    }


    @Override
    public String alimentacao() {
        return "Alpiste";
    }

    @Override
    public String som() {
        return "Canto de passáro";
    }
}
