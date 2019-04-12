package SchoolClass;

public class MainClass {
    public static void main(String[] args) {
        Class clas = new Class();
        clas.doisplayStudent();

        clas.addStudent("Mariusz");
        clas.addStudent("Anna");
        clas.addStudent("Jan");
        clas.addStudent("Ola");
        clas.addStudent("Magdalena");

        clas.doisplayStudent();
        System.out.println("This class has: " + clas.getGirlsCount()
                + " girls and " + clas.getBoysCount() + " boys.");
        System.out.println("Sum of student names is: " + clas.sumStudents() + ".");

    }
}
