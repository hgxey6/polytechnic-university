package week13.decorators;

import week13.HumanBehavior;

public class Human implements HumanBehavior {

    @Override
    public void doSomething() {
        System.out.println("|during something|");
    }
}
