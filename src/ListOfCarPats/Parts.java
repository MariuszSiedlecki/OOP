package ListOfCarPats;

public class Parts {
    private String name;
    private int quantity;
    private double price;

    public Parts(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGuqntity() {
        return quantity;
    }

    public void setGuqntity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "name:'" + name +
                        ", quantity:" + quantity +
                        ", price:" + price;
    }
}
