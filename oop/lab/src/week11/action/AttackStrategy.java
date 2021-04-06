package week11.action;

public class AttackStrategy implements BattleStrategy {

    @Override
    public void toAct() {
        System.out.println("The tank is attacking");
    }

    @Override
    public String getCondition() {
        return "AttackStrategy";
    }
}
