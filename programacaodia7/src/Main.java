import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static List<Employee> readFile(String filePath) {
        List<Employee> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Employee employee = new Employee(values[0], values[1], Double.parseDouble(values[2]));
                records.add(employee);
            }
            return records;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String file_path;
        Double salary;

        System.out.print("File path: ");
        file_path = scanner.next();

        System.out.print("Salary: ");
        salary = scanner.nextDouble();

        List<Employee> records = Main.readFile(file_path);
        if (records != null) {
            records.sort(new EmployeeComparator());
            System.out.println("Email of people who make more than " + salary + ":");
            records.forEach(e -> {
                if (e.salary() > salary) {
                    System.out.println(e.email());
                }
            });
            double soma = 0;
            for (Employee record : records) {
                if (record.name().toUpperCase().startsWith("M")) {
                    soma += record.salary();
                }
            }
            System.out.println("Sum of salary of people whose name starts with the letter M: " + soma);
        }
    }
}