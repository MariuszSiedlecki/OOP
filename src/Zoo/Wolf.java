package Zoo;

import java.util.Arrays;

public class Wolf extends Animal implements Canine {
    private int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    public int getFangLength() {
        return fangLength;
    }

    @Override
    public void introduce() {
        System.out.println(
                "I'm wolf. My name is Pimpek "
                        + getWeight()
                        + " kg and my fang length is "
                        + getFangLength()
                        + ".");

    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");

    }
}
