package service;

import dto.Item;

import java.util.List;

/*
* buy SKU 1 & SKU 2 for a fixed price ( C + D = 30 )
* returns the total amount to be paid after applying the discount.
*
* */

public class PromoTwo implements Promotion{

    private String item1;
    private String item2;
    private double discountedPrice;

    public PromoTwo(String item1, String item2, double discountedPrice) {
        this.item1 = item1;
        this.item2 = item2;
        this.discountedPrice = discountedPrice;
    }

    @Override
    public double apply(List<Item> cart) {
        return 0;
    }
}
