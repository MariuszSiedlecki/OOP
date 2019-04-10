package Laptop;

public class Laptop {
    private String name;
    private int grade;

    public Laptop() {
    }

    ;

    public Laptop(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void introduce() {
        String masage = "Hi I'm " + name + " and ";
        if (grade < 10) {
            masage += " I'm very slovly laptop ";
        } else if (grade >= 10 && grade <= 20) {
            masage += " I'm quite amchine";
        } else {
            masage += " I'm very fast laptop ";
        }
        System.out.println(masage);
    }
}
