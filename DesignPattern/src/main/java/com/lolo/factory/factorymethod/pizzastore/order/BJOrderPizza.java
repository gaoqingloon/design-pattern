package com.lolo.factory.factorymethod.pizzastore.order;

import com.lolo.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.lolo.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.lolo.factory.factorymethod.pizzastore.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {

    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new BJCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }

}
