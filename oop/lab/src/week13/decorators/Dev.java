package week13.decorators;

import week13.HumanBehavior;

public class Dev extends Decorator {

    public Dev(HumanBehavior humanBehavior) {
        super(humanBehavior);
    }

    @Override
    public void doSomething() {
        System.out.print("|develops an application|");
        super.doSomething();
    }
}
