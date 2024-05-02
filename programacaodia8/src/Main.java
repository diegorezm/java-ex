import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> readFile(String filePath) {
        List<Product> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Product product = new Product(values[0], Double.parseDouble(values[1]),
                        Integer.parseInt(values[2]));
                records.add(product);
            }
            return records;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path;
        System.out.print("File path: ");
        path = scanner.next();
        List<Product> products = Main.readFile(path);
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/out/summary.txt"));
        if (products != null) {
            for (Product e : products) {
                try {
                    writer.write(e.name() + "," + e.price() + "\n");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        writer.close();
        System.exit(0);
    }
}