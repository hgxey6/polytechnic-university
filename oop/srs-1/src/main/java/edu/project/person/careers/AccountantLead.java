package edu.project.person.careers;

import edu.project.actions.Leadership;

public class AccountantLead extends Accountant implements Leadership {

    public AccountantLead() {
    }

    @Override
    public void toLead() {
        System.out.println("The AccountantLead leads the finance team");
    }

    @Override
    public void salaryBonus() {
        double salary = super.getSalary();
        salary += 5000;
        super.setSalary(salary);
    }
}
