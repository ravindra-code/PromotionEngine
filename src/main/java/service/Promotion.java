package service;

import dto.Item;

import java.util.List;

public interface Promotion {

    public double apply(List<Item> cart);
}
