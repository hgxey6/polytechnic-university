package edu.project.person.careers;

import edu.project.person.Employee;

public class Boss extends Employee {

    @Override
    public void work() {
        System.out.println("Boss");
    }

    public void salaryUp(Employee e) {
        double salary = e.getSalary();
        salary += 1000;
        e.setSalary(salary);
    }
}
