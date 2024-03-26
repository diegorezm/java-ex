import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;
        String[] words = {"apple", "banana", "cat", "dog", "elephant", "forest", "happy"};
        int randomIndex = (int) (Math.random() * words.length);
        String randomWord = words[randomIndex];
        JogoDaForca jogoDaForca = new JogoDaForca(randomWord);
        while (true) {
            if (jogoDaForca.getLetrasChutadas().isEmpty()) {
                System.out.println("Nenhuma letra foi inserida até o momento.");
            } else {
                System.out.println("Letras que você chutou até o momento:");
                jogoDaForca.getLetrasChutadas().stream().forEach(e -> {
                    System.out.print(e + "\t");
                });
                System.out.println("\nErros: " + jogoDaForca.getErros() + "\tAcertos: " + jogoDaForca.getAcertos());
            }
            System.out.println();
            System.out.print("Chute uma letra: ");
            letra = scanner.next().charAt(0);
            jogoDaForca.chutarLetra(letra);
            if (jogoDaForca.ganhou()) {
                System.out.println("Voce ganhou!");
                break;
            }
            if (jogoDaForca.perdeu()) {
                System.out.println("Voce perdeu! :(");
                break;
            }
        }
    }
}