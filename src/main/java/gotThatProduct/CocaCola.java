package gotThatProduct;

public class CocaCola extends Drink {
    public CocaCola(String name, double price) {
        super(name, price);
    }


    public int consume() {
        int randomNum = (int) (Math.random() * 31);

        return randomNum;
    }
}
