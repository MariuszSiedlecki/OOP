package Laptop;

import Laptop.Laptop;

import java.util.ArrayList;
import java.util.List;

public class MainLaptop {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("Lenovo", 8));
        laptopList.add(new Laptop("Dell", 15));
        laptopList.add(new Laptop("Asus", 20));
        laptopList.add(new Laptop("Aple", 25));

        for (Laptop laptop : laptopList) {
            laptop.introduce();
        }
        for (int i = 0; i < laptopList.size(); i++) {
            if (laptopList.get(i).getGrade() > 20) {
                System.out.println(laptopList.get(i).getName()
                        + " It is the best laptop " + laptopList.get(i).getGrade() + ".");
            }

        }
    }
}
