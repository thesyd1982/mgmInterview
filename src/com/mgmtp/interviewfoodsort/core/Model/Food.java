/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Model;

/**
 * An abstract class that represents a Food
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public abstract class Food {

    /**
     * integer represents the size of the Food
     */
    private int size;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
