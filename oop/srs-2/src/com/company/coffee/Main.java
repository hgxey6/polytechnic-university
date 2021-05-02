package com.company.coffee;

import com.company.coffee.dec.Milk;
import com.company.coffee.dec.Mocha;
import com.company.coffee.dec.Sugar;
import com.company.coffee.types.Americano;
import com.company.coffee.types.Beverage;
import com.company.coffee.types.Espresso;

public class Main {
    public static void main(String[] args) {
        Beverage coffee1 = new Espresso();
        coffee1 = new Milk(coffee1);
        coffee1 = new Sugar(coffee1);
        System.out.println("Coffee1 cost: " + coffee1.cost() + " " + coffee1.getDescription());

        Beverage coffee2 = new Americano();
        coffee2 = new Sugar(coffee2);
        coffee2 = new Mocha(coffee2);
        System.out.println("Coffee2 cost: " + coffee2.cost() + " " + coffee2.getDescription());
    }
}
