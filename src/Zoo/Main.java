package Zoo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Big bear", 125, 5);
        Tiger tiger = new Tiger("King Lion", 100, 20);
        Wolf wolf = new Wolf("Milusiński", 45, 6);
        Dog dog = new Dog("Szarik", 50);

        List<Animal> animalList = Arrays.asList(bear, tiger, wolf, dog);
        for (Animal animal : animalList) {
            System.out.print(animal.getId() + " : ");
            animal.introduce();

        }
        List<Canine> canines = Arrays.asList(wolf, dog);
        for (Canine canine : canines) {
            if (canine instanceof Animal) {
                Animal animal = (Animal) canine;
                System.out.print("My name is " + animal.getName() + " and am barking: ");
            }
            canine.bark();
            if (canine instanceof Dog) {
                Dog dog1 = (Dog) canine;
                dog1.sitePrety();
            }
        }
    }
}