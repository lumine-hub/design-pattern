package com.xlm.design.factory;

import com.xlm.design.base.Coffee;
import com.xlm.design.base.Dessert;

/**
 * @author xlm
 * @date 2024/7/11 17:47
 */
public interface DessertFactory {
    Coffee createCoffee();

    Dessert createDessert();

}
