package Employee;

public class Employee {
    private int id;
    private int salary;
    private String position;
    private static int COUNTER = 0;

    public Employee(String position, int salary) {
        this.id = ++COUNTER;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "(" + getId() + ") (" + getPosition() + ") " + getSalary();
    }
}
