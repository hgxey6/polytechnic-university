package week11;

import week11.action.AttackStrategy;
import week11.action.ProtectionStrategy;

public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.setStrategy(new AttackStrategy());
        tank.setDirection(Direction.TO_THE_LEFT);
        tank.info();
        tank.toAct();

        tank.setStrategy(new ProtectionStrategy());
        tank.setDirection(Direction.BACK);
        tank.info();
        tank.toAct();
    }
}
