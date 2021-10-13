package gotThatProduct;

public abstract class Drink extends Product implements Consumable {

    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return DISCOUNT_RATE * getPrice();
    }

    public final double DISCOUNT_RATE = 0.3;

    @Override
    public int consume() {
        return 0;
    }
}
