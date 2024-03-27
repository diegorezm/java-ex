import java.util.*;

public class JogoDaForca {
    private final String palavra;
    private char[] palavra_char;
    private String[] letrasChutadas;
    private Integer acertos;
    private Integer erros;

    public JogoDaForca() {
        this.palavra = this.setupWord().toLowerCase();
        this.setup();
    }
    public JogoDaForca(String palavra) {
        this.palavra = palavra.toLowerCase();
        this.setup();
    }
    private void setup() {
        this.palavra_char = this.palavra.toCharArray();
        this.letrasChutadas = this.setupLines(palavra.length());
        this.acertos = 0;
        this.erros = 0;
    }

    private String[] setupLines(int length) {
        String[] lines = new String[length];
        Arrays.fill(lines, "_");
        return lines;
    }

    private String setupWord() {
        try {
            return WordGenerator.getWord();
        } catch (Exception e) {
            return WordGenerator.genWord();
        }
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
        return this.erros >= 6;
    }
    private boolean ganhou() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String p : this.letrasChutadas) {
            stringBuilder.append(p);
        }
        return this.palavra.contentEquals(stringBuilder);
    }

    private void ending(){
        String message = this.ganhou() ? "Voce ganhou!" : "Você perdeu!";
        System.out.flush();
        System.out.println(message);
        System.out.println("A palavra era: "  + this.palavra);
    }

    private void chutarLetra(char letra) {
        if (this.palavra.contains(String.valueOf(letra))) {
            this.acertos += 1;
            for (int i = 0; i < this.palavra_char.length; i++) {
                if (this.palavra_char[i] == letra) {
                    this.letrasChutadas[i] = String.valueOf(letra);
                }
            }
        } else {
            this.erros += 1;
        }
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        char letra;
        while (true) {
            System.out.println("Letras que você chutou até o momento:");
            for (String p : this.letrasChutadas) {
                System.out.print(p + "\t");
            }
            System.out.println();
            Stages.printStages(erros, palavra);
            System.out.println();
            System.out.print("Chute uma letra: ");
            letra = scanner.next().charAt(0);
            this.chutarLetra(letra);
            if (this.ganhou()) {
                this.ending();
                break;
            }
            if (this.perdeu()) {
                this.ending();
                break;
            }
        }
    }
}
