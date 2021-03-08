package edu.project.person.careers;

import edu.project.actions.Leadership;

public class ProgrammerLead extends Programmer implements Leadership {

    public ProgrammerLead() {
    }

    @Override
    public void toLead() {
        System.out.println("The ProgrammerLead leads the software team");
    }

    @Override
    public void salaryBonus() {
        double salary = super.getSalary();
        salary += 8000;
        super.setSalary(salary);
    }
}
