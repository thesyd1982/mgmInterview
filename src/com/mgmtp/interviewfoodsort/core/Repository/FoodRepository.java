/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Repository;

import java.util.ArrayList;
import java.util.List;
import com.mgmtp.interviewfoodsort.core.Model.Food;

/**
 * An implemantation thats handles the Data layer
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public class FoodRepository implements IFoodRepository {

    private static FoodRepository instance;

    private final List<Food> foodList;

    
    
    private FoodRepository() {
        this.foodList = new ArrayList<>();

    }

    /**
     * this method insure that only one instance could be used in the whole
     * application
     *
     * @return Only one FoodRepository instance
     */
    public static FoodRepository getInstance() {
        if (instance == null) {
            instance = new FoodRepository();
        }
        return instance;
    }

    @Override
    public List<Food> findAll() {
        return this.foodList;
    }

    @Override
    public void save(Food food) {
        foodList.add(food);
    }

}
