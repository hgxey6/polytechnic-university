package com.company.icecream;

public class Main {
    public static void main(String[] args) {
        IceCreamMachine iceCreamMachine = IceCreamMachine.getInstance();
        iceCreamMachine.setId(4);

        IceCreamMachine iceCreamMachine2 =IceCreamMachine.getInstance();

        System.out.println(iceCreamMachine.equals(iceCreamMachine2));

        iceCreamMachine.createIceCream();
        iceCreamMachine.createIceCream();
        iceCreamMachine.createIceCream();
    }
}
