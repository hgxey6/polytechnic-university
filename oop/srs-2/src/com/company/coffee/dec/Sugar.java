package com.company.coffee.dec;

import com.company.coffee.types.Beverage;

public class Sugar extends CondimentDecorator {

    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    public double cost() {
        return 50 + beverage.cost();
    }
}
