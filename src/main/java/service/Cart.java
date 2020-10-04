package service;

import dto.Item;

import java.util.HashMap;
import java.util.List;

public class Cart {

    public double getTotalAmount(List<Item> products){

        double total =0;
        for (Item item: products){
            total+= item.getPrice();
        }
        return total;
    }

    public double applyPromotion(List<Item> products, Promotion promotion){
        HashMap<String, Integer> items = new HashMap<>();

        for (Item item: products){
            if (items.containsKey(item.getId())){
                items.put(item.getId(), items.get(item.getId())+1);
            }else{
                items.put(item.getId(), 1);
            }
        }
        return promotion.apply(items );


    }



}
