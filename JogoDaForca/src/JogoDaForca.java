import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JogoDaForca {
    private String palavra;
    private char[] palavra_char;
    private String[] letrasChutadas;
    private Integer acertos;
    private Integer erros;

    public JogoDaForca(String palavra) {
        this.palavra = palavra;
        this.palavra_char = palavra.toCharArray();
        this.letrasChutadas = this.setupLines(palavra.length());
        this.acertos = 0;
        this.erros = 0;
    }

    private String[] setupLines(int length) {
        String[] lines = new String[length];
        Arrays.fill(lines, "_");
        return lines;
    }

    public Integer getAcertos() {
        return acertos;
    }

    public Integer getErros() {
        return erros;
    }

    public String[] getLetrasChutadas() {
        return letrasChutadas;
    }

    private boolean perdeu() {
        if (this.erros > 6) return true;
        return false;
    }

    private boolean ganhou() {
        StringBuilder stringBuilder = new StringBuilder();
        for(String p: this.letrasChutadas){
            stringBuilder.append(p);
        }
        return this.palavra.contentEquals(stringBuilder);
    }

    private void chutarLetra(char letra) {
        if (this.palavra.contains(String.valueOf(letra))) {
            this.acertos += 1;
            for(int i =0; i < this.palavra_char.length; i++ ){
                if(this.palavra_char[i] == letra) {
                    this.letrasChutadas[i] = String.valueOf(letra);
                }
            }
        } else {
            this.erros += 1;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        char letra;
        while (true) {
                System.out.println("Letras que você chutou até o momento:");
                for(String p: this.letrasChutadas) {
                    System.out.print(p + "\t");
                }
                System.out.println("\nErros: " + this.getErros() + "\tAcertos: " + this.getAcertos());
            System.out.println();
            System.out.print("Chute uma letra: ");
            letra = scanner.next().charAt(0);
            this.chutarLetra(letra);
            if (this.ganhou()) {
                System.out.flush();
                System.out.println("Voce ganhou!");
                System.out.println("A palavra era: " + this.palavra);
                break;
            }
            if (this.perdeu()) {
                System.out.flush();
                System.out.println("Voce perdeu! :(");
                System.out.println("A palavra era: " + this.palavra);
                break;
            }
        }
    }
}
