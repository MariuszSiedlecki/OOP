package VoicesAnimals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal("Dog", "woof", true));
        list.add(new Animal("Cat", "miau", false));
        list.add(new Animal("Cow", "moooo", true));
        list.add(new Animal("Pig", "hrum", false));

        Random random = new Random();
        System.out.println("Loud animals");
        for (Animal animal : list) {
            if (animal.isLoud()) {
                System.out.print(animal.getName() + " : ");
                animal.speak(random.nextInt(4) + 1);
            }
        }
        System.out.println("Silent animals");
        for (Animal animal : list) {
            if (!animal.isLoud()) {
                System.out.print(animal.getName() + " : ");
                animal.speak(random.nextInt(4) + 1);
            }
        }
    }
}
