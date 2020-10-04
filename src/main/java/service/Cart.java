package service;

import dto.Item;
import exception.PromotionsException;

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

    public double applyPromotion(List<Item> products, Promotion promotion) throws PromotionsException {
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

    public double findBestPromotion(List<Item> products) throws PromotionsException{

        List<Promotion> promotions = ActivePromotions.initiatePromotions();
        double discount = Integer.MIN_VALUE;
        for (Promotion promotion: promotions){
            double dis = applyPromotion(products, promotion);
            if (dis>discount){
                discount = dis;
            }

        }
        return discount;

    }

    public double initiateTransaction(List<Item> products, Promotion promotion)throws PromotionsException{

        double total = getTotalAmount(products) - applyPromotion(products, promotion);
        System.out.println("Total amount to be paid after applying promotion: " + total);
        return total;
    }





}
