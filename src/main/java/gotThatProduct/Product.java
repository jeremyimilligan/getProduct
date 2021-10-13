package gotThatProduct;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Product {
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // access mod, datatype, instance var
    private String name;
    private double price;
    protected ExpirationDate expirationDate;
    public final double DISCOUNT_RATE = 0.1;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void printExpirationDate(Product product){


        System.out.println(product.getName() + " expires: on " + product.expirationDate);
    }
    public String printIngredients(String[] ingredients){
        return Arrays.toString(ingredients);

    }
    public abstract double calculateDiscount();


    public static void printConsumptionQty(ArrayList<Consumable> consumables){
        for (Consumable c: consumables) {
            System.out.println(c.consume());
        }

    }
    public static void printOrder(Product[] products){
        double total = 0.0;
        for (Product p: products) {
            total += p.getPrice();
            System.out.println(p.getName() + " will cost you, " + p.getPrice());

        }
        System.out.println("Your total will be " + total);

    }
}
