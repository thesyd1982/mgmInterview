/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Repository;

import java.util.List;
import com.mgmtp.interviewfoodsort.core.Model.Food;

/**
 * An interface thats handles the Data layer
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public interface IFoodRepository {

    /**
     * this method returns the list of the stored Food
     *
     * @return A list of stored Food
     */
    public List<Food> findAll();

    /**
     * this method store a Food instance
     *
     * @param food a Food subclass instance
     */
    public void save(Food food);
}
