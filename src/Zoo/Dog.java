package Zoo;

public class Dog extends Animal implements Canine {

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.println(
                "I'm dog. My name is "
                        + getName()
                        + " I weight "
                        + getWeight()
                        + " kg.");

    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sitePrety() {
        System.out.println(getName() + " sits pretty ");
    }
}
