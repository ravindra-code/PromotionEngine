package service;

import dto.Item;

import java.util.List;

/*
* buy SKU 1 & SKU 2 for a fixed price ( C + D = 30 )
* returns the total amount to be paid after applying the discount.
*
* */

public class PromoTwo implements Promotion{


    @Override
    public double apply(List<Item> cart) {
        return 0;
    }
}
