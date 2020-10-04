package data;

import exception.InvalidProductException;

public enum Price {

    A("A",50),
    B("B",30),
    C("C",20),
    D("D", 15);


    private final String item;
    private final double cost;

    Price(String item, double cost){
        this.cost = cost;
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public double getCost() {
        return cost;
    }

    public static Price getEnum(String key) throws Exception{

        switch (key){
            case "A":return Price.A;

            case "B": return Price.B;

            case "C": return Price.C;

            case "D": return Price.D;

            default: throw new InvalidProductException("Item not found.", null);
        }
    }



}
