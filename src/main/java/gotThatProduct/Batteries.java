package gotThatProduct;

public class Batteries extends Product implements Consumable{


    public Batteries(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

    @Override
    public int consume() {
        int randomNum = (int)(Math.random() * 101);

        return randomNum;
    }
}
