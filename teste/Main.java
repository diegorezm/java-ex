public class Main {
    public static void main(String[] args) {
        char matriz[][] = {
                { 'O', 'Q', '*', '|' },
                { 'E', '*', 'E', 'S' },
                { 'R', 'E', 'U', 'T' },
                { 'A', '*', '*', 'S' }
        };

        char aux = ' ';
        for (int li = 0; li < 4; li++) {
            for (int col = li + 1; col < 4; col++) {
                aux = matriz[li][col];
                matriz[li][col] = matriz[col][li];
                matriz[col][li] = aux;
            }
        }

        aux = matriz[0][0];
        matriz[0][0] = matriz[3][3];
        matriz[3][3] = aux;
        aux = matriz[1][1];
        matriz[1][1] = matriz[2][2];
        matriz[2][2] = aux;
        String dados = "";
        for (int li = 0; li < matriz.length; li++) {
            for (int col = 0; col < matriz[0].length; col++) {
                dados += matriz[li][col];
            }
        }
        System.out.println(dados);
    }

}
