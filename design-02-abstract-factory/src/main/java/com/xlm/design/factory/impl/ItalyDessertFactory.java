package com.xlm.design.factory.impl;

import com.xlm.design.base.Coffee;
import com.xlm.design.base.Dessert;
import com.xlm.design.entity.LatteCoffee;
import com.xlm.design.entity.Trimisu;
import com.xlm.design.factory.DessertFactory;

/**
 * @author xlm
 * @date 2024/7/11 17:51
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
    @Override
    public Dessert createDessert() {
        return new Trimisu();
    }
}
