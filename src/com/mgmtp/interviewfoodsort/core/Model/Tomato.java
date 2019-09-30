/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgmtp.interviewfoodsort.core.Model;

import static com.mgmtp.interviewfoodsort.core.Contstants.Constants.DEFAULT_SIZE;

/**
 * A concrete class that represents a Tomato
 *
 * @author douakha salah
 * @since 18-10-2018
 */
public class Tomato extends Food {

    public Tomato() {
        this.setSize(DEFAULT_SIZE);
    }

    public Tomato(int size) {
        this.setSize(size);
    }
}
