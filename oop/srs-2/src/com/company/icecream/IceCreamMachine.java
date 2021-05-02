package com.company.icecream;

import java.util.Objects;

public class IceCreamMachine {

    private static IceCreamMachine instance;
    private int id;

    private IceCreamMachine() {}

    public static IceCreamMachine getInstance() {
        if (instance == null) {
            instance = new IceCreamMachine();
        }
        return instance;
    }

    public void createIceCream() {
        System.out.println("icecream");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCreamMachine that = (IceCreamMachine) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}