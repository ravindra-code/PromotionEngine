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
    public double apply(List<Item> cart) {

        HashMap<String, Integer> items = new HashMap<>();
        double total = 0;
        for (Item item: cart){
            if (items.containsKey(item.getId())){
                items.put(item.getId(), items.get(item.getId())+1);
            }else{
                items.put(item.getId(), 1);
            }
            total += item.getPrice();
        }
        if (items.containsKey(this.item1) && items.containsKey(this.item2) ){
            total += this.discountedPrice - (Price.getEnum(item1).getCost() +
                    Price.getEnum(item2).getCost());
        }else{
            System.out.println("PromoTwo not applicable.");

        }
        return total;
    }
}
