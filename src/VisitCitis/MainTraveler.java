package VisitCitis;

public class MainTraveler {
    public static void main(String[] args) {
        Traveler traveler = new Traveler("Mariusz", "Podróżniczy");
        traveler.visit("New York");
        traveler.visit("Monaco");
        traveler.visit("Sydney");
        System.out.println(traveler);
    }
}
