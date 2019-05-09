package Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeesInfo {
    private List<Employee>employees = new ArrayList<>();

    public EmployeesInfo() {
        loadEmployee();
    }

    public void loadEmployee(){
        this.employees = Arrays.asList(
                new Employee("Programer",13000),
                new Employee("Secretary",6500),
                new Employee("Programer",8000),
                new Employee("Programer",4000)
        );
    }
    public void displayEmployees(){
        employees.forEach(System.out::println);
    }
}
