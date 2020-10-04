package service;

import dto.Item;

import java.util.List;

public class PromoOne implements Promotion{

    /*
    * buy 'n' items of a SKU for a fixed price (3 A's for 130)
    * returns the total amount after applying the discount.
    * */

    @Override
    public double apply(List<Item> cart) {
        return 0;
    }
}
