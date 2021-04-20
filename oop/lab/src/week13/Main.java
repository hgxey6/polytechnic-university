package week13;

import week13.decorators.*;

public class Main {
    public static void main(String[] args) {
        Decorator d = new WebDev(new Dev(new Worker(new Human())));
        d.doSomething();

        Decorator d2 = new Worker(new WebDev(new Human()));
        d2.doSomething();
    }
}
