package Zoo;

public class Bear extends Animal {

    private int furLength;

    public Bear(String name, float weight, int furLength) {
        super(name, weight);
        this.furLength = furLength;
    }


    public int getFurLength() {
        return furLength;
    }

    public void setFurLength(int furLength) {
        this.furLength = furLength;
    }

    @Override
    public void introduce() {
        System.out.println(
                "I'm bear. My name is Big Bear. I weight "
                        + getWeight()
                        + " kg and my fur length is "
                        + getFurLength());

    }
}
