package classes;

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

    // a
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

    // c
    public int somar() {
        int res = 0;
        for (int i = 0; i <= colecao.length - 1; i++) {
            res += colecao[i];
        }
        return res;
    }

    // e
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

    // d
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

    // b
    public void randomColect() {
        Random rand = new Random();
        while (adiciona(rand.nextInt(colecao.length + 1)));
    }

    // k
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

    // i
    public int[] eDivisivel(int num) {
        int[] aux = new int[cont];
        int j = 0;
        for (int i = 0; i < cont; i++) {
            if (colecao[i] % num == 0 && colecao[i] != 0) {
                aux[j] = colecao[i];
                j++;
            }
        }
        return aux;
    }

    // l
    public int[] maisRepetido() {
        int[] res = new int[2];
        int[] digits = new int[cont];
        int[] cnt = new int[cont];

        int cnt_tm = 0;
        int digito = 0;
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
                digito = digits[i];
                cnt_tm = cnt[i];
            }
        }
        res[0] = digito;
        res[1] = cnt_tm + 1;

        return res;
    }

    // f
    public int binarySearch(int target) throws Exception {
        long tempoComeco = System.currentTimeMillis();
        long tempoLimite = 2000;
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
            long tempoAgora = System.currentTimeMillis();
            if (tempoAgora - tempoComeco > tempoLimite) {
                throw new Exception("TEMPO LIMITE EXCEDIDO!");
            }
        }
        return -1;
    }

    // g
    public int[] findIndex(int target) throws Exception {
        int[] idx = new int[colecao.length];
        int j = 0;
        int i = 0;
        while (i < colecao.length) {
            if (colecao[i] == target) {
                idx[j] = i;
                j++;
            }
            i++;
        }
        if (j == 0) {
            throw new Exception("INDEX NÃO ENCONTRADO!");
        }
        return idx;
    }

    // h
    public int[] subistituir(int target, int num) throws Exception {
        int cnt = 0;
        for (int i = 0; i < colecao.length; i++) {
            if (colecao[i] == target) {
                colecao[i] = num;
                cnt += 1;
            }
        }
        if (cnt == 0) {
            throw new Exception("Valor não encontrado!");
        }
        return colecao;
    }

    // j
    public String histograma(int[] arr) {
        StringBuilder dados = new StringBuilder("# \t\tValores \thistograma\n");
        for (int i = 0; i < arr.length; i++) {
            String histograma = "";
            int j = 0;
            while (j < arr[i]) {
                histograma += "=";
                j++;
            }
            dados.append(i + " :  \t\t").append(arr[i] + "\t\t").append(histograma).append("\n");
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

    public String histograma() {
        StringBuilder dados = new StringBuilder("# \t\tValores \thistograma\n");
        for (int i = 0; i < cont; i++) {
            String histograma = "";
            int j = 0;
            while (j < colecao[i]) {
                histograma += "=";
                j++;
            }
            dados.append(i + " :  \t\t").append(colecao[i] + "\t\t").append(histograma).append("\n");
        }
        return dados.toString();
    }

    public String dados(int[] arr, int num) {
        StringBuilder dados = new StringBuilder("Valores da coleção:\n");
        if (num == 0) {
            for (int i = 0; i < arr.length; i++) {
                dados.append(arr[i]).append("\n");
            }
        } else {
            dados.append("Número mais repetido: " + arr[0]+"\n");
             dados.append("Vezes que se repetiu: " + arr[1]+"\n");
            
        }
        return dados.toString();

    }

}
