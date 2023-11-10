package Cartoes;

import java.util.Random;

public class CartaoSorteio extends Cartao {
    
    public CartaoSorteio(int qtde) {
        super(qtde);
    }

    public void sorteiaNumeros() {
        Random random = new Random();
        int i = 0;
        while(i < super.getNumerosLength()){
            int numero = random.nextInt(50) + 1;
            try {
                super.addNumeros(numero);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
