package week14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConditionData implements Observable {

    private List<Observer> observers;
    private String condition;
    private String name;
    private String time;

    public ConditionData(String name) {
        this.name = name;
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            String message = "name - " + name + " :: condition - " + condition + " :: time - " + time;
            observer.update(message);
        }
    }

    public void setCondition(String condition) {
        this.condition = condition;
        this.time = new Date().toString();
        notifyObservers();
    }
}
