package Cartoes;

import java.util.Random;

public class CartaoSorteio  {

    private int[] numerosSorteados;

    public CartaoSorteio() {
        numerosSorteados = new int[6];
    }

    public int[] getNumerosSorteados() {
        return numerosSorteados;
    }
    
    public boolean existe(int numero) {
        for (int i = 0; i < numerosSorteados.length; i++) {
            if (numerosSorteados[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public void sorteiaNumeros() {
        Random random = new Random();
        int i = 0;
        while(i < numerosSorteados.length){
            int numero = random.nextInt(50) + 1;
            if(!existe(numero)){
                numerosSorteados[i] = numero;
                i++;
            }
        }

    }

    @Override
    public String toString() {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        for(int num: numerosSorteados){
            dados.append(num +"\t");
         }
        return dados.toString();
    }
    
}
