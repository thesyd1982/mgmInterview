/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Service;

import java.util.List;
import com.mgmtp.interviewfoodsort.core.Model.Food;

/**
 * An interface thats handles the interactions bitween the user and the Data
 * layer
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public interface IFoodService {

    /**
     * this method adds an instance of Food to the stored list
     *
     * @param food a Food subclass instance
     */
    public void addFood(Food food);

    /**
     * this method returns all the stored list of Food
     *
     * @return a Food List
     */
    public List<Food> getFoodList();

    /**
     * this method sort the stored list of Food
     */
    public void sortFoodList();

    /**
     * this method determine if the stored list is sorted
     *
     * @return  true if the list of Food is sorted false else
     */
    public boolean isSorted();
}
