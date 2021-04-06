package week11;

import week11.action.BattleStrategy;

public class Tank {

    private Direction direction;
    private BattleStrategy strategy;

    public Tank() {
    }

    public void toAct() {
        strategy.toAct();
    }

    public Tank(Direction direction, BattleStrategy strategy) {
        this.direction = direction;
        this.strategy = strategy;
    }

    public Direction getDirection() {
        return direction;
    }

    public BattleStrategy getStrategy() {
        return strategy;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void setStrategy(BattleStrategy strategy) {
        this.strategy = strategy;
    }

    public void info() {
        System.out.println("strategy " + strategy.getCondition() + " :: direction " + direction);
    }
}
