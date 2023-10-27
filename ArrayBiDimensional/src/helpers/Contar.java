package helpers;
import Matriz.MatrizDeInteiros;
public class Contar {

    static public int contar(int num, int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == num) {
                    total++;
                }
            }
        }
        return total;
    }

    static public int contarPar(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    total += 1;
                }
            }
        }
        return total;
    }

    static public int contarImpar(int[][] matriz) {
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 != 0) {
                    total += 1;
                }
            }
        }
        return total;
    }

    static public int contarPrimos(int[][] matriz) {
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (MatrizDeInteiros.ePrimo(matriz[i][j])) {
                    total += 1;
                }
            }
        }
        return total;
    }
}
