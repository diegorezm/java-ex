package calculalucropormes;

import java.util.Random;

public class Matriz {

    private int matriz[][];

    public Matriz() {
        this.matriz = new int[12][4];
        populate();
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void populate() {
        Random random = new Random();
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[0].length; col++) {
                matriz[lin][col] = random.nextInt(6000);
            }
        }
    }

    public String decidirMes(int input) {
        String mes = "";
        switch (input) {
            case 0:
                mes = "janeiro";
                break;
            case 1:
                mes = "fevereiro";
                break;
            case 2:
                mes = "março";
                break;
            case 3:
                mes = "abril";
                break;
            case 4:
                mes = "maio";
                break;
            case 5:
                mes = "junho";
                break;
            case 6:
                mes = "julho";
                break;
            case 7:
                mes = "agosto";
                break;
            case 8:
                mes = "setembro";
                break;
            case 9:
                mes = "outubro";
                break;
            case 10:
                mes = "novembro";
                break;

            case 11:
                mes = "dezembro";
                break;
            default:
                break;
        }
        return mes;
    }

    public int[] calculaVenda() {
        int[] vendas = new int[12];
        int index = 0;
        for (int lin = 0; lin < matriz.length - 1; lin++) {
            int totalLinha = 0;
            for (int col = 0; col < matriz[0].length - 1; col++) {
                totalLinha += matriz[lin][col];
            }
            vendas[index] = totalLinha;
            index++;
        }
        return vendas;
    }

    public String dados() {
        StringBuilder dados = new StringBuilder("Valores da coleção: \n");
        int[] vendas = calculaVenda();
        for (int i = 0; i < vendas.length; i++) {
            String mes = decidirMes(i);
            dados.append("Os ganhos no mês de " + mes + " foram de: R$" + vendas[i] + "\n");
        }
        return dados.toString();
    }
}
