import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            String word = WordGenerator.genWord();
            JogoDaForca jogoDaForca = new JogoDaForca(word);
            jogoDaForca.run();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}