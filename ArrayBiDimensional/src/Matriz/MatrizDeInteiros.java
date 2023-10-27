package Matriz;

import java.util.Random;

public class MatrizDeInteiros {

    private int col, row;
    private int[][] matriz;

    public MatrizDeInteiros(int col, int row) {
        this.col = col;
        this.row = row;
        matriz = new int[row][col];
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void gerarMatriz() {
        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matriz[i][j] = random.nextInt(26);
            }
        }
    }

    public void Limpar() {
        matriz = new int[0][0];
    }

    public int[][] diagonalPrincipal() {
        int[][] diagonal = new int[row][col];
        int row_d = 0;
        int col_d = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    diagonal[row_d][col_d] = matriz[i][j];
                    row_d++;
                    col_d++;
                }
            }
        }

        return diagonal;
    }

    public int[][] diagonalSecundaria() {
        int[][] diagonal = new int[row][col];
        int row_d = 0;
        int col_d = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j == matriz.length - 1) {
                    diagonal[row_d][col_d] = matriz[i][j];
                    row_d++;
                    col_d++;
                }
            }
        }

        return diagonal;
    }

    public int contar(int num) {
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matriz[i][j] == num) {
                    total++;
                }
            }
        }
        return total;
    }

    public int[][] findNums(int num) {
        int[][] index = null;
        int linhas = contar(num);
        if (linhas != 0) {
            index = new int[linhas][2];
            int rows = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matriz[i][j] == num) {
                        index[rows][0] = i;
                        index[rows][1] = j;
                        rows++;
                    }
                }
            }
        }

        return index;
    }

    public int[][] matrizTransposta() {
        int[][] matrizTransposta = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        return matrizTransposta;
    }

    public int somaTotal() {
        int total = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                total += matriz[i][j];
            }
        }
        return total;
    }

    public int[] somaLinhas() {
        int[] total = new int[row];
        for (int i = 0; i < row; i++) {
            int totalLinha = 0;
            for (int j = 0; j < col; j++) {
                totalLinha += matriz[i][j];
            }
            total[i] = totalLinha;
        }
        return total;
    }

    public int[] somaColunas() {
        int[] total = new int[row];
        for (int i = 0; i < row; i++) {
            int totalColuna = 0;
            for (int j = 0; j < col; j++) {
                totalColuna += matriz[j][i];
            }
            total[i] = totalColuna;
        }
        return total;
    }
    public boolean eSimetrica(){
        if(matriz == matrizTransposta()) return true;
        return false;
    }

    public String dados() {
        StringBuilder dados = new StringBuilder("Matriz: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                dados.append(matriz[i][j] + " \t");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String dados(int[][] input) {
        StringBuilder dados = new StringBuilder("Matriz: \n");
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                dados.append(input[i][j] + " \t");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String dados(int[][] input, String texto) {
        StringBuilder dados = new StringBuilder(texto);
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                dados.append(input[i][j] + " \t");
            }
            dados.append("\n");
        }
        return dados.toString();
    }

    public String dados(int[] input, String texto) {
        StringBuilder dados = new StringBuilder(texto);
        for (int i = 0; i < input.length; i++) {
            dados.append(input[i] + " \n");
        }
        return dados.toString();
    }

    public String dados(int[] input, String texto, String tipo) {
        StringBuilder dados = new StringBuilder(texto);
        if (tipo.equals("col")) {
            for (int numero : input) {
                dados.append(numero + "\n");
            }
        } else if(tipo.equals("row")){
            for (int numero : input) {
                dados.append(numero + "\t");
            }
        }else{
            return "Por favor forneça um tipo válido (row ou col)!";
        }
        return dados.toString();
    }

}
