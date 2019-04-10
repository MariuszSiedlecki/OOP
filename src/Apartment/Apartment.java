package Apartment;

import java.util.LinkedList;
import java.util.List;

public class Apartment {
    private String City;
    private float area;
    private float priceForMeter;

    public Apartment(String city, float area, float priceForMeter) {
        City = city;
        this.area = area;
        this.priceForMeter = priceForMeter;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPriceForMeter() {
        return priceForMeter;
    }

    public void setPriceForMeter(float priceForMeter) {
        this.priceForMeter = priceForMeter;
    }

    public float fullPrice() {
        return area * priceForMeter * 0.85f;
    }

    @Override
    public String toString() {
        return "Apartment in "
                + getCity()
                + " per meter "
                + String.format("%.2f", getArea())
                + " It's a cost: "
                + String.format("%.2f", fullPrice()) + " zł ";
    }

}
