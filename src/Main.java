import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apartment> apartmentList = new LinkedList<>();
        apartmentList.add(new Apartment("Kraków", 59, 6900.00f));
        apartmentList.add(new Apartment("Warszawa", 59, 9900.00f));
        apartmentList.add(new Apartment("Łódź", 59, 3900.00f));
        float sum = 0;
        for (int i = 0; i < apartmentList.size(); i++) {
            System.out.println((i + 1 + "." + apartmentList.get(i)));
            sum += apartmentList.get(i).fullPrice();
        }
        float average = sum / apartmentList.size();
        System.out.println("Avarege price of apartments: " + String.format("%.2f", average) + " zł ");
    }
}
