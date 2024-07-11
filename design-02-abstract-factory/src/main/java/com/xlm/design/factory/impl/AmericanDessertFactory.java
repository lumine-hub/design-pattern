package com.xlm.design.factory.impl;

import com.xlm.design.base.Coffee;
import com.xlm.design.base.Dessert;
import com.xlm.design.entity.AmericanCoffee;
import com.xlm.design.entity.Trimisu;
import com.xlm.design.factory.DessertFactory;

/**
 * @author xlm
 * @date 2024/7/11 17:48
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
