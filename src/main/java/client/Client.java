package client;

import dto.Item;
import exception.PromotionsException;
import service.Cart;
import service.PromoOne;
import service.Promotion;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws PromotionsException{

        try {

            List<Item> products = new ArrayList<>();
            products.add(new Item("A", 50));
            products.add(new Item("A", 50));
            products.add(new Item("A", 50));
            products.add(new Item("B", 30));
            Promotion promoOne = new PromoOne(3, "A", 130);
            Cart checkout = new Cart();
            double total = checkout.initiateTransaction(products, promoOne);

        }catch (PromotionsException e){
            throw new PromotionsException("Exception occured during the checkout", null );
        }
    }
}
