package week14;

import java.util.ArrayList;
import java.util.List;

public class CentralComputer implements Observer {

    private List<String> conditionsLogs;

    public CentralComputer() {
        this.conditionsLogs = new ArrayList<>();
    }

    @Override
    public void update(String message) {
        conditionsLogs.add(message);
        System.out.println(message);
    }

    public List<String> getConditionsLogs() {
        return conditionsLogs;
    }
}
