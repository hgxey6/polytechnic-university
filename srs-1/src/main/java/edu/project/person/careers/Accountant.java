package edu.project.person.careers;

import edu.project.actions.ProjectManagement;
import edu.project.person.Employee;
/*
 * Accountants are responsible for the financial affairs of the company.
 */
public class Accountant extends Employee implements ProjectManagement {

    @Override
    public void work() {
        System.out.println("Accountant is working");
    }

    @Override
    public void manageAProject() {
        System.out.println("Accountant leads the project");
    }


}
