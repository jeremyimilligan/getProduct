package gotThatProduct;

public class Cheeseburger extends Food implements Consumable{
    public Cheeseburger(String name, double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        int randomNum = (int)(Math.random() * 101);

        return randomNum;
    }






}
