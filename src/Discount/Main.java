package Discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Article article = new Article();
        List<Article>articleList = Arrays.asList(
                new Article("Shower Gel",23.80f,1.23f),
                new Article("Cream",14.05f,1.30f),
                new Article(" Gel",23.80f,1.40f)
        );
        for (Article a:articleList) {
            for (int i = 0; i <article.getDiscounts().length ; i++) {
                float priceWithMargin = a.getPrice() * a.getMargin();
                float discountValue = priceWithMargin * a.getDiscounts()[i];
                float finalPrice = priceWithMargin - discountValue;
                a.setPrice(finalPrice);
            }
            System.out.println(a);

        }
    }
}
