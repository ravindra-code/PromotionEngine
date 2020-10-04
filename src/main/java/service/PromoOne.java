package service;

import data.Price;
import dto.Item;

import java.util.HashMap;
import java.util.List;

public class PromoOne implements Promotion{

    /*
    * buy 'n' items of a SKU for a fixed price (3 A's for 130)
    * returns the total amount after applying the discount.
    * */

    private Integer quantity;
    private String item;
    private double discountedPrice;

    public PromoOne(){
    }

    public PromoOne(Integer quantity, String item, double discountedPrice){
        this.quantity = quantity;
        this.item = item;
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
        if (items.get(this.item)<this.quantity){
            System.out.println("PromoOne is not applicable...");
        }else{
            total = total + this.discountedPrice -
                    (this.quantity * Price.getEnum(this.item).getCost());
        }

        return total;
    }
}
