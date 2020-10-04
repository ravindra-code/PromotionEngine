package service;

import data.Price;
import dto.Item;

import java.util.HashMap;
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
    public double apply(HashMap<String, Integer> items) throws Exception {


        if (items.containsKey(this.item1) && items.containsKey(this.item2) ){
            return (Price.getEnum(item1).getCost() +
                    Price.getEnum(item2).getCost()) - this.discountedPrice;
        }else{
            System.out.println("PromoTwo not applicable.");

        }
        return 0;
    }
}
