import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1,y1,z1;
        double x2,y2,z2;

        System.out.println("Lados do triângulo X: ");
        // LENDO NA MESMA LINHA
        String[] sides1 = scanner.nextLine().split(" ");
        x1 = Double.parseDouble(sides1[0]);
        y1 = Double.parseDouble(sides1[1]);
        z1 = Double.parseDouble(sides1[2]);
        System.out.println("Lados do triângulo Y: ");
        // LENDO NA MESMA LINHA
        String[] sides2 = scanner.nextLine().split(" ");
        x2 = Double.parseDouble(sides2[0]);
        y2 = Double.parseDouble(sides2[1]);
        z2 = Double.parseDouble(sides2[2]);

        Double p1 = Calc.calcP(x1,y1,z1);
        Double p2 = Calc.calcP(x2,y2,z2);

        Double a1 = Calc.calcA(p1,x1,y1,z1);
        Double a2 = Calc.calcA(p2,x2,y2,z2);


        System.out.println("Área do triângulo X: " + String.format("%.2f", a1));
        System.out.println("Área do triângulo Y: " + String.format("%.2f", a2));

        String message = a1 > a2 ?
                "O triângulo X é maior do que o triângulo Y" :
                "O triângulo Y é maior do que o triângulo X";

        System.out.println(message);
    }
}
