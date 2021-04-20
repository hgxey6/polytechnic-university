package week13.decorators;

import week13.HumanBehavior;

public class WebDev extends Decorator {

    public WebDev(HumanBehavior humanBehavior) {
        super(humanBehavior);
    }

    @Override
    public void doSomething() {
        System.out.print("|develops a website|");
        super.doSomething();
    }
}
