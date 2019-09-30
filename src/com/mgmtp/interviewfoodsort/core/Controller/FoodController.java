/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Controller;

import static com.mgmtp.interviewfoodsort.core.Contstants.Constants.*;
import com.mgmtp.interviewfoodsort.core.Model.Potato;
import com.mgmtp.interviewfoodsort.core.Model.Tomato;
import com.mgmtp.interviewfoodsort.core.Service.IFoodService;

/**
 * This class handles a user interactions
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public class FoodController {

    private IFoodService foodService;
    private static FoodController instance;

    private FoodController() {

    }

    /**
     * this method insure that only one instance could be used in the whole
     * application
     *
     * @return Only one FoodController instance
     */
    public static FoodController getFoodControllerInstance() {
        if (instance == null) {
            instance = new FoodController();
        }
        return instance;
    }

    /**
     * this method creates and stores a food list
     */
    public void createFixitureFoodList() {
        Tomato tomato = new Tomato(11);
        foodService.addFood(tomato);

        tomato = new Tomato();
        foodService.addFood(tomato);

        Potato potato = new Potato(1);
        foodService.addFood(potato);

        potato = new Potato(42);
        foodService.addFood(potato);

        potato = new Potato(77);
        foodService.addFood(potato);

        potato = new Potato(55);
        foodService.addFood(potato);

        potato = new Potato(46);
        foodService.addFood(potato);

        potato = new Potato(12);
        foodService.addFood(potato);

        potato = new Potato(11);
        foodService.addFood(potato);

        potato = new Potato(9);
        foodService.addFood(potato);

    }

    /**
     * this method is used to print a food list
     */
    public void printFoodList() {

        if (foodService.isSorted()) {
            System.out.println(MESSAGE_SORTED);
        } else {
            System.out.println(MESSAGE_UNSORTED);
        }

        foodService.getFoodList().forEach((food) -> System.out.println(food.toString()));
        System.out.println(MESSAGE_SEPARATOR);
    }

    /**
     * this method is used to sort a stored food list
     */
    public void sortFoodList() {
        foodService.sortFoodList();
    }

    public IFoodService getFoodService() {
        return foodService;
    }

    public void setFoodService(IFoodService foodService) {
        this.foodService = foodService;
    }
}
