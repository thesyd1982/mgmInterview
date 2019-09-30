/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core;

import com.mgmtp.interviewfoodsort.core.Controller.FoodController;
import com.mgmtp.interviewfoodsort.core.Service.FoodService;
import com.mgmtp.interviewfoodsort.core.Service.IFoodService;

/**
 * the main entry point of the application simply used to create and sort a list
 * of foods
 *
 * @author douakha salah
 * @since 18-10-2018
 * @version 1.0.0
 */
public class App {

    /**
     * This method creates, prints, and stores an unsorted list of Food. After
     * that, the method prints the sorted sorted list.
     *
     * @param args Unused
     */
    public static void main(String[] args) {

        IFoodService fs = FoodService.getFoodServiceInstance();
        FoodController foodController = FoodController.getFoodControllerInstance();

        foodController.setFoodService(fs);

        foodController.createFixitureFoodList();
        foodController.printFoodList();

        foodController.sortFoodList();
        foodController.printFoodList();

    }

}
