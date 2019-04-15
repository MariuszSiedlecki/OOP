package SchoolClass;

public class MainClass {
    public static void main(String[] args) {
        Class clas = new Class();
        clas.doisplayStudent();

        clas.addStudent(new Students("Mariusz","Kowalski",25));
        clas.addStudent(new Students("Anna","Piękna",30));
        clas.addStudent(new Students("Jan","Smieszny",28));
        clas.addStudent(new Students("Ola", "Młoda",20));
        clas.addStudent(new Students("Magdalena","Blondi",22));

        clas.doisplayStudent();
        System.out.println("This class has: " + clas.getGirlsCount()
                + " girls and " + clas.getBoysCount() + " boys.");
        System.out.println("Sum of student names is: " + clas.sumStudents() + ".");

    }
}
