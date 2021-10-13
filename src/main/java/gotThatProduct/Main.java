package gotThatProduct;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batteries batteries = new Batteries("duracell",20);
        CocaCola cocaCola = new CocaCola("Coke", 30);
        Cheeseburger cheeseburger = new Cheeseburger("Double Cheese Burger", 10);
        Car car = new Car("Tesla",80000.0);

        ArrayList<Consumable> consumables = new ArrayList<>();
        consumables.add(batteries); consumables.add(cocaCola); consumables.add(cheeseburger);

        ExpirationDate expirationDate = new ExpirationDate("January", "12th","2022");
        batteries.setExpirationDate(expirationDate);
        batteries.printExpirationDate(batteries);



        Product[] items = {cocaCola, cheeseburger, batteries, car};
        Product.printOrder(items);

        Product.printConsumptionQty(consumables);

        System.out.println(cocaCola.calculateDiscount());
        System.out.println(cheeseburger.calculateDiscount());
        System.out.println(car.calculateDiscount());

        System.out.println(cheeseburger.isEdible());

        Drink drink = new CocaCola("Sprite", 1.99);
        String[] ingredients = {"Sugar", "Water", "Caffeine"};
        System.out.println(drink.consume());
        System.out.println(drink.printIngredients(ingredients));








    }

}
