package SchoolClass;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private List<Students> names = new ArrayList<>();
    public int count = 0;

    public Class() {
    }

    public Class(List<Students> names) {
        this.names = names;
    }

    public void addStudent(Students students) {
        names.add(students);
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
        for (Students name : names) {
            if (name.getName().endsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public int getBoysCount() {
        for (Students name : names) {
            if (!name.getName().endsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public int sumStudents() {
        int sum = 0;
        for (Students name : names) {
            sum++;
        }
        return sum;

        }
    }

