import gotThatProduct.Cheeseburger;
import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    @Test
    public void myTest(){
        Cheeseburger cheeseburger = new Cheeseburger("Big Mac", 5.99);
        cheeseburger.calculateDiscount();

        double expected = 1.1980000000000002;
        Assert.assertEquals(expected, cheeseburger.calculateDiscount(), 0);
    }

}
