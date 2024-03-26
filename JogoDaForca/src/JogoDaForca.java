import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JogoDaForca {
    private String palavra;
    private List<String> letrasChutadas;
    private Integer acertos;
    private Integer erros;

    public JogoDaForca(String palavra) {
        this.palavra = palavra;
        this.letrasChutadas = new ArrayList<>();
        this.acertos = 0;
        this.erros = 0;
    }

    public JogoDaForca(List<String> letrasChutadas) {
        this.letrasChutadas = letrasChutadas;
    }


    public Integer getAcertos() {
        return acertos;
    }

    public Integer getErros() {
        return erros;
    }
    public List<String> getLetrasChutadas() {
        return letrasChutadas;
    }

    public void chutarLetra(char letra) {
        this.letrasChutadas.add(Character.toString(letra));
        if (this.palavra.contains(String.valueOf(letra))) {
            this.acertos += 1;
        } else {
            this.erros += 1;
        }
    }

    public boolean perdeu() {
        if (this.erros > 6) return true;
        return false;
    }

    public boolean ganhou() {
        StringBuilder stringBuilder = new StringBuilder();
        this.letrasChutadas.stream().forEach(e -> {
            stringBuilder.append(e);
        });
        if (this.palavra.equals(stringBuilder.toString())) return true;
        return false;
    }


}
