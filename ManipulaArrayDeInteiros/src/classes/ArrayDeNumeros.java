package classes;

import java.util.Arrays;
import java.util.Random;

public class ArrayDeNumeros {

    //Atributos
    private int colecao[];
    private int cont;

    //Construtores
    public ArrayDeNumeros(int tamanho) {
        colecao = new int[tamanho];
        cont = 0;
    }

    public ArrayDeNumeros() {
        colecao = new int[10];
        cont = 0;
    }

    public int tamanhoColecao() {
        return colecao.length;
    }

    public boolean adiciona(int numero) {
        if (cont < colecao.length) {
            colecao[cont] = numero;
            cont++;
            return true;
        }
        return false;
    }

    public void cleanColect() {
        cont = 0;
    }

    public int somar() {
        int res = 0;
        for (int i = 0; i <= colecao.length - 1; i++) {
            res += colecao[i];
        }
        return res;
    }

    public int[] sort() {
        for (int i = 0; i < colecao.length; i++) {
            for (int j = 0; j < colecao.length - 1; j++) {
                if (colecao[j] > colecao[j + 1]) {
                    int aux = colecao[j];
                    colecao[j] = colecao[j + 1];
                    colecao[j + 1] = aux;
                }
            }
        }
        return colecao;
    }

    public int[] inverter() {
        int i = colecao.length - 1;
        int j = 0;
        int[] aux = new int[colecao.length];
        while (i > 0) {
            aux[j] = colecao[i];
            j++;
            i--;
        }
        return aux;
    }

    public void randomColect() {
        Random rand = new Random();
        while (adiciona(rand.nextInt(colecao.length)));
    }

    public int[] valoresPar() {
        int[] aux = new int[colecao.length];
        int j = 0;
        for (int i = 0; i < colecao.length; i++) {
            if (colecao[i] % 2 == 0 && colecao[i] != 0) {
                aux[j] = colecao[i];
                j++;
            }
        }
        return aux;
    }

    public int[] eDivisivel(int num) {
        int[] aux = new int[cont];
        int j = 0;
        for (int i = 0; i < cont; i++) {
            if (colecao[i] % num == 0 && colecao[i] != 0) {
                aux[j] = colecao[i];
            }
        }
        return aux;
    }

    public String histograma() {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        for (int i = 0; i < cont; i++) {
            String histograma = "";
            int j = 0;
            while (j < colecao[i]) {
                histograma += "=";
                j++;
            }
            dados.append(i + " :  \t").append(colecao[i] + "\t").append(histograma).append("\n");
        }
        return dados.toString();
    }

    public int maisRepetido() {
        int res = 0;
        int[] digits = new int[cont];
        int[] cnt = new int[cont];
        int j = 0;
        for (int i = 0; i < cont - 1; i++) {
            if (colecao[i] == colecao[i + 1]) {
                digits[j] = colecao[i];
                cnt[j] += 1;
            } else {
                j++;
            }
        }
        for (int i = 0; i < cont - 1; i++) {
            if (cnt[i] > cnt[i + 1]) {
                res = digits[i];
            }
        }
        return res;
    }

    public int binarySearch(int target) {
        int esq = 0;
        int dir = cont - 1;
        while (esq <= dir) {
            int mid = esq + (dir - esq) / 2;
            if (mid == target) {
                return mid;
            }
            if (colecao[mid] < target) {
                esq = mid + 1;
            } else {
                dir = mid + 1;
            }
        }
        return -1;
    }

    public String histograma(int[] arr) {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        for (int i = 0; i < arr.length; i++) {
            String histograma = "";
            int j = 0;
            while (j < arr[i]) {
                histograma += "=";
                j++;
            }
            dados.append(i + " :  \t").append(arr[i] + "\t").append(histograma).append("\n");
        }
        return dados.toString();
    }

    public String histograma(int num) {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        String histograma = "";
        int j = 0;
        while (j < num) {
            histograma += "=";
            j++;
        }
        dados.append(num + "\t").append(histograma).append("\n");
        return dados.toString();
    }

}
