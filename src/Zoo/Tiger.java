package Zoo;

public class Tiger extends Animal {
    private int clawLength;

    public Tiger(String name, float weight, int clawLength) {
        super(name, weight);
        this.clawLength = clawLength;
    }

    public int getClawLength() {
        return clawLength;
    }

    @Override
    public void introduce() {
        System.out.println(
                "I'm tiger. My name is King Lion. I weight "
                        + getWeight()
                        + " kg and my claw lenght is "
                        + getClawLength());
    }
}
