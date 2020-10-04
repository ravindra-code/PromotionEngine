import dto.Item;
import exception.PromotionsException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import service.Cart;
import service.PromoOne;
import service.PromoTwo;
import service.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.CheckedOutputStream;

public class TestPromotionEngine {

    private static final double DELTA = 1e-15;

    @Test
    public void testPromoOne() throws PromotionsException {

        List<Item> products = new ArrayList<>();
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        Promotion promoOne = new PromoOne(3, "A", 130);
        Cart checkout = new Cart();
        double price = checkout.applyPromotion(products, promoOne);
        Assert.assertEquals(price, 20, DELTA);

    }

    @Test
    public void testPromoTwo() throws Exception{

        List<Item> products = new ArrayList<>();
        products.add(new Item("A", 50));
        products.add(new Item("B", 30));
        products.add(new Item("C", 20));
        products.add(new Item("D", 15));
        Promotion promoTwo = new PromoTwo("C", "D", 30);
        Cart checkout = new Cart();
        double price = checkout.applyPromotion(products, promoTwo);
        Assert.assertEquals(price, 5, DELTA);

        double total = checkout.initiateTransaction(products, promoTwo);
        Assert.assertEquals(total,110,DELTA);

    }

    @Test
    public void testTotalAmount(){

        List<Item> products = new ArrayList<>();
        products.add(new Item("A", 50));
        products.add(new Item("B", 30));
        products.add(new Item("C", 20));
        Cart cart = new Cart();
        double total=  cart.getTotalAmount(products);
        Assert.assertEquals(total, 100, DELTA);
    }

    @Test
    public void testBestPromotion() throws Exception{
        List<Item> products = new ArrayList<>();
        Cart cart = new Cart();
        products.add(new Item("A", 50));
        products.add(new Item("A", 50));
        products.add(new Item("A", 50));
        products.add(new Item("B", 30));
        products.add(new Item("C", 20));
        products.add(new Item("D", 15));
        double bestPrice = cart.findBestPromotion(products);
        Assert.assertEquals(bestPrice, 20, DELTA);

    }
}
