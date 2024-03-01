package Matriz;

import java.util.Random;

public class Matriz {

    private int row, col;
    private int matriz[][];

    public Matriz(int row, int col) {
        this.row = row;
        this.col = col;
        this.matriz = new int[row][col];
        populate();
    }

    public void populate() {
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int num = random.nextInt(0, 41);
                matriz[i][j] = num;
            }
        }
    }

    public int[][] triangular() {
        int[][] diagonal = matriz;

        for (int i = 0; i <= matriz.length - 1; i++) {
            for (int j = 0; j <= matriz[i].length - 1; j++) {
                int max_len = matriz[i].length - 1;
                if (i == j) {
                    int t = j + 1;
                    while (t <= max_len) {
                        diagonal[i][t] = 0;
                        t++;
                    }
                }
            }
        }
        return diagonal;
    }

    public String dados() {
        StringBuilder dados = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dados.append(matriz[i][j]).append("\t");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String dados(int[][] triangular) {
        StringBuilder dados = new StringBuilder();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dados.append(triangular[i][j]).append("\t");
            }
            dados.append("\n");
        }
        return dados.toString();
    }
}
