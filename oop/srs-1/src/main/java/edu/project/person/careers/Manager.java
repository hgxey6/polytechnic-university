package edu.project.person.careers;

import edu.project.actions.ProjectManagement;
import edu.project.person.Employee;

/*
 * Managers do most of the paperwork in the company.
 */
public class Manager extends Employee implements ProjectManagement {

    public Manager() {

    }

    @Override
    public void work() {
        System.out.println("Manager is working");
    }

    @Override
    public void manageAProject() {
        System.out.println("Manager leads the project");
    }

    public void presentProduct(String product) {
        System.out.println("Product: " + product);
    }
}
