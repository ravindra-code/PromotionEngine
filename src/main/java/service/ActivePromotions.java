package service;

import java.util.ArrayList;
import java.util.List;

public class ActivePromotions {

    public static List<Promotion> activePromotions = new ArrayList<>();

    public static List<Promotion> initiatePromotions(){

        activePromotions.add(new PromoOne(3,"A",130));
        activePromotions.add(new PromoOne(2, "B", 45));
        activePromotions.add(new PromoTwo("C","D",30));
        return activePromotions;
    }

}
