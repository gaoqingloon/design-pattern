package com.lolo.factory.factorymethod.pizzastore.order;

import com.lolo.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import com.lolo.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import com.lolo.factory.factorymethod.pizzastore.pizza.Pizza;


public class LDOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }

}
