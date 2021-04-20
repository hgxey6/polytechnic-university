package week13.decorators;

import week13.HumanBehavior;

public class Worker extends Decorator {

    public Worker(HumanBehavior humanBehavior) {
        super(humanBehavior);
    }

    @Override
    public void doSomething() {
        System.out.print("|during work|");
        super.doSomething();
    }
}
