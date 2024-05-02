import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.name().compareTo(t1.name());
    }
}
