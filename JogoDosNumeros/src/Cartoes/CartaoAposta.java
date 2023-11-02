package Cartoes;

public class CartaoAposta extends Cartao {

    public CartaoAposta(int tamanho) {
        super(tamanho);
    }


    public float calculaAposta() {
        switch (super.getNumerosLength()) {
            case 6:
                return 4.5f;
            case 7:
                return 31.5f;
            case 8:
                return 126.0f;
            case 9:
                return 378.0f;
            case 10:
                return 945.0f;
            default:
                return -1.0f;
        }
    }

    public int certos(CartaoSorteio sorteio) {
        int[] numeroSorteados = sorteio.getNumerosSorteados();
        int[] numerosDoUsuario = super.getNumeros();
        int acertos = 0;

        for (int i = 0; i < super.getNumerosLength(); i++) {
            int numeroApostado = numerosDoUsuario[i];
            for (int numeroSorteado : numeroSorteados) {
                if (numeroApostado == numeroSorteado) {
                    acertos++;
                    break;
                }
            }

        }
        return acertos;
    }

    public int[] acharCertos(CartaoSorteio sorteio) {
        int[] nums = new int[certos(sorteio)];
        int j = 0;
        int[] numeroSorteados = sorteio.getNumerosSorteados();
        int[] numerosDoUsuario = super.getNumeros();

        for (int numeroApostado : numerosDoUsuario) {
            for (int numeroSorteado : numeroSorteados) {
                if (numeroApostado == numeroSorteado) {
                    nums[j] = numeroApostado;
                    j++;
                    break;
                }
            }
        }

        return nums;
    }

    public Cartao acertos(CartaoSorteio sorteio) {
        Cartao cartao;
        int acertos = certos(sorteio);
        cartao = new Cartao(acertos);
        return cartao;
    }
}
