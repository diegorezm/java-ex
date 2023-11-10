package Cartoes;

public class Cartao {
  private int[] numeros;
    private int totNumeros;

    public Cartao(int qtde) {
        numeros = new int[qtde];
        totNumeros = 0;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public int getNumerosLength() {
        return numeros.length;
    }

    public int getTotNumeros() {
        return totNumeros;
    }

    public int addNumeros(int numero) throws Exception{
        if (existe(numero)) {
            throw new NumberFormatException("Número já existe...");
        }
        if (totNumeros < numeros.length) {
            numeros[totNumeros] = numero;
            totNumeros++;
        }
        return numero;
    }

    public boolean existe(int numero) {
        for (int i = 0; i < totNumeros; i++) {
            if (numeros[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void limpar() {
        totNumeros = 0;
    }

    public String numerosCartao() {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        for (int i = 0; i < totNumeros; i++) {
            dados.append(numeros[i] + "\n");
        }
        return dados.toString();
    }

    public String dados(int[] numeroSorteados, int numeroAposta, float valorAposta) {
        StringBuilder dados = new StringBuilder("Aposta nº " + numeroAposta + "\n");
        dados.append("Número de acertos: " + numeros.length + "\n");
        dados.append("Números sorteados: \n" );
        for (int i = 0; i < numeroSorteados.length; i++) {
            dados.append(numeroSorteados[i] + "\t");
        }
        dados.append("\nValor da aposta: R$" + valorAposta);
        return dados.toString();
    }

   
}
