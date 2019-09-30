/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.mgmtp.interviewfoodsort.core.Model.Food;
import com.mgmtp.interviewfoodsort.core.Repository.FoodRepository;

/**
 * An implementation thats handles the interactions bitween the user and the
 * Data layer
 *
 * @author douakha salah
 * @since 18-10-2018
 *
 */
public class FoodService implements IFoodService {

    private final FoodRepository foodRepository;
    private static FoodService instance;

    private FoodService() {
        this.foodRepository = FoodRepository.getInstance();
    }

    /**
     * this method insure that only one instance could be used in the whole
     * application
     *
     * @return Only one FoodService instance
     */
    public static FoodService getFoodServiceInstance() {
        if (instance == null) {
            instance = new FoodService();
        }
        return instance;
    }

    @Override
    public void addFood(Food food) {
        foodRepository.save(food);
    }

    @Override
    public List<Food> getFoodList() {
        return foodRepository.findAll();
    }

    @Override
    public void sortFoodList() {
        List<Food> foodList = foodRepository.findAll();
        Comparator<Food> sizeComparator;
        sizeComparator = Comparator.comparingInt((food) -> food.getSize());
        Collections.sort(foodList, sizeComparator);
    }

    @Override
    public boolean isSorted() {

        List<Food> foodList = getFoodList();
        int i = 0;

        while (i < foodList.size() - 1 && (foodList.get(i).getSize() <= foodList.get(i + 1).getSize())) {
            i++;
        }

        return i == foodList.size() - 1;

    }

}
