package edu.project.person.careers;

import edu.project.actions.Leadership;

public class ManagerLead extends Manager implements Leadership {

    public ManagerLead() {
    }

    @Override
    public void work() {
        System.out.println("ManagerLead is working");
    }

    @Override
    public void toLead() {
        System.out.println("The ManagerLead leads the management team");
    }

    @Override
    public void salaryBonus() {
        double salary = super.getSalary();
        salary += 10000;
        super.setSalary(salary);
    }
}
