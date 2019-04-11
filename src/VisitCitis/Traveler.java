package VisitCitis;

import java.util.Set;
import java.util.TreeSet;

public class Traveler {
    private String name;
    private String username;
    private Set<String> cities = new TreeSet<>();

    public Traveler(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void visit(String city) {
        cities.add(city);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" ").append(username).append(" visited the city:\n");
        for (String city : cities) {
            stringBuilder.append("*").append(city).append("\n");

        }
        return String.valueOf(stringBuilder);
    }
}
