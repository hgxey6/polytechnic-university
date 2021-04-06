package week11.action;

public class ProtectionStrategy implements BattleStrategy {

    @Override
    public void toAct() {
        System.out.println("The tank is protecting");
    }

    @Override
    public String getCondition() {
        return "ProtectionStrategy";
    }
}
