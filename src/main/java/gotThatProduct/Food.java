package gotThatProduct;

public abstract class Food extends Product implements Consumable, Edible{

    public Food(String name, double price) {
        super(name, price);
    }
    public final double DISCOUNT_RATE = 0.2;
   @Override
    public double calculateDiscount() {
        return DISCOUNT_RATE * getPrice();
    }



    @Override
    public int consume() {
        return 0;
    }

    @Override
    public boolean isEdible() {
        return true;
    }
}
