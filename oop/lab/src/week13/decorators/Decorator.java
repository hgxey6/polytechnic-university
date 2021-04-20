package week13.decorators;

import week13.HumanBehavior;

public abstract class Decorator implements HumanBehavior {

    protected HumanBehavior humanBehavior;

    public Decorator(HumanBehavior humanBehavior) {
        this.humanBehavior = humanBehavior;
    }

    @Override
    public void doSomething() {
        humanBehavior.doSomething();
    }
}
