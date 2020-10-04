package service;

import exception.PromotionsException;

import java.util.HashMap;

public interface Promotion {

    double apply(HashMap<String, Integer> cart) throws PromotionsException;
}
