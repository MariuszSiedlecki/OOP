package Employee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesInfo {
    private List<Employee> employees = new ArrayList<>();

    public EmployeesInfo() {
        loadEmployee();
    }

    public void loadEmployee() {
        this.employees = Arrays.asList(
                new Employee("Director", 13000),
                new Employee("Secretary", 4000),
                new Employee("Manager", 8000),
                new Employee("Manager", 8100),
                new Employee("Employee", 3500)
        );
    }

    public void displayEmployees() {
        employees.forEach(System.out::println);
    }

    public void salaryEmployee() {
        float count = 0;
        for (Employee emploee : employees) {
            System.out.println(emploee);
        }
    }

    public void displayRichEmployees() {
        List<Integer> richId = new ArrayList<>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getSalary() > 7000) {
                richId.add(employees.get(i).getId());
            }
        }
        System.out.print("Employee who earn mor than 7K: ");
        for (int i = 0; i < richId.size(); i++) {
            System.out.print(richId.get(i));
            if (i < richId.size() - 1) {
                System.out.print(", ");
            } else {
                System.out.print(". \n");
            }
        }
    }

    public void displayAnnualMean() {
        float mean = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getPosition().equals("Manager")) {
                mean += employee.getSalary() * 12;
                count++;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        mean /= count;
        System.out.println("Mean annual salary Manager is: " + decimalFormat.format(mean));
    }
}
