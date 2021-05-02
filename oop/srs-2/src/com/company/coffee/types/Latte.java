package com.company.coffee.types;

import com.company.coffee.types.Beverage;

public class Latte extends Beverage {

    public Latte() {
        description = "Latte";
    }
    public double cost() {
        return 600;
    }
}