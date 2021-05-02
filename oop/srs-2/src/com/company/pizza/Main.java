package com.company.pizza;

import com.company.pizza.type.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        Pizza pizza1 = store.orderPizza("clam");
        Pizza pizza2 = store.orderPizza("random");

        System.out.println(pizza);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
