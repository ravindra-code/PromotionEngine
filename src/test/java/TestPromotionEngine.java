import dto.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import service.PromoOne;
import service.Promotion;

import java.util.ArrayList;
import java.util.List;

public class TestPromotionEngine {

    private static final double DELTA = 1e-15;

    @Test
    public void testPromoOne(){

        List<Item> products = new ArrayList<>();
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        Promotion promoOne = new PromoOne(3, "A", 130);
        double price = promoOne.apply(products);
        Assert.assertEquals(price, 130, DELTA);

    }

    @Test
    public void testPromoTwo(){

    }
}
