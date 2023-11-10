package operacoesComDoisNumeros;

public class DoisNumerosInteiros {

    //Atributos
    private int numero1, numero2;

    //Construtores
    public DoisNumerosInteiros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public DoisNumerosInteiros() {
    }

    //Métodos de Acesso set e get
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Métodos Gerais - Operações básicas com dois números
    public int adicao() {
        return numero1 + numero2;
    }

    public int subtracao() {
        return numero1 - numero2;
    }

    public int multiplicacao() {
        return numero1 * numero2;
    }

    public int divisao() {
        return numero1 / numero2;
    }

    public int divisaoPar() throws ArithmeticException{
        if (numero2 % 2 == 0) {
            return numero1 / numero2;
        } else {
            throw new  ArithmeticException("O divisor deve ser par...");
        }
    }
}
