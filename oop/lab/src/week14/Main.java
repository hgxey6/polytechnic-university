package week14;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CentralComputer centralComputer = new CentralComputer();

        ConditionData fire = new ConditionData("fire");
        fire.registerObserver(centralComputer);
        fire.setCondition("OK");

        ConditionData security = new ConditionData("security");
        security.registerObserver(centralComputer);
        security.setCondition("NOT BAD");

        ConditionData water = new ConditionData("water");
        water.registerObserver(centralComputer);
        water.setCondition("GOOD");


        System.out.println();
        List<String> logs = centralComputer.getConditionsLogs();
        for (String log : logs) {
            System.out.println(log);
        }

    }
}
