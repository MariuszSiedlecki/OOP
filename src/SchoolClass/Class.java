package SchoolClass;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private List<String> names = new ArrayList<>();
    public int count = 0;

    public Class() {
    }

    public Class(List<String> names) {
        this.names = names;
    }

    public void addStudent(String name) {
        names.add(name);
    }

    public void doisplayStudent() {
        if (names.size() == 0) {
            System.out.println("Empty list");
        } else {
            System.out.print("Student's: ");
            for (int i = 0; i < names.size(); i++) {
                System.out.print(names.get(i));
                if (i < names.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(".\n");
        }
    }

    public int getGirlsCount() {
        for (String name : names) {
            if (name.endsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public int getBoysCount() {
        for (String name : names) {
            if (!name.endsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public int sumStudents() {
        int sum = 0;
        for (String name : names) {
            sum++;
        }
        return sum;
    }
}
