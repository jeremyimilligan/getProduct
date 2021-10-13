package gotThatProduct;

public class Car extends Product{


    public Car(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return DISCOUNT_RATE * getPrice();
    }
}
