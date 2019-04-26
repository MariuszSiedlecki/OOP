package Zoo;

public abstract class Animal {
    private int id;
    private String name;
    private float weight;
    private static int COUNTER = 0;

    public Animal(String name, float weight) {
        this.id = ++COUNTER;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public abstract void introduce();
}
