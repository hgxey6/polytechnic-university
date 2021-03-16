package rk1.secondTask;

import rk1.firstTask.Human;

public abstract class Specialist extends Human {

    private String specialtyName;
    private double experience;
    private boolean bachelor;
    private double salary;

    public Specialist() {
    }

    public String getSpecialtyName() {
        return specialtyName;
    }

    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public boolean isBachelor() {
        return bachelor;
    }

    public void setBachelor(boolean bachelor) {
        this.bachelor = bachelor;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
    public abstract void toGoOnHoliday();

}
