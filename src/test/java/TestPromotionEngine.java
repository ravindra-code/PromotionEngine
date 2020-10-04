import dto.Item;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import service.PromoOne;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class TestPromotionEngine {

    @Test
    public void testPromoOne(){

        List<Item> products = new ArrayList<>();
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        products.add( new Item("A",50 ));
        PromoOne promoOne = new PromoOne();
        double price = promoOne.apply(products);
        Assert.assertEquals(price, 130);


    }
}
