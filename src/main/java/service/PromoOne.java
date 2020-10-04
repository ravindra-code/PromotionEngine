package service;

import data.Price;
import exception.PromotionsException;

import java.util.HashMap;

public class PromoOne implements Promotion{

    /*
    * buy 'n' items of a SKU for a fixed price (3 A's for 130)
    * returns the discounted amount.
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
    public double apply(HashMap<String, Integer> items) throws PromotionsException{

        if (items.get(this.item)<this.quantity){
            System.out.println("PromoOne is not applicable...");
        }else{
            return (this.quantity * Price.getEnum(this.item).getCost()) -this.discountedPrice;
        }

        return 0;
    }
}
