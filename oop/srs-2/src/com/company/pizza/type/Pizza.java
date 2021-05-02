package com.company.pizza.type;

public abstract class Pizza {

    protected String name = "";

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                '}';
    }
}
