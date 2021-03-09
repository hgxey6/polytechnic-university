import edu.project.person.careers.*;
import edu.project.person.enums.CategoryOfProgrammers;
import edu.project.person.enums.Gender;
import edu.project.person.enums.Rank;
import org.junit.Test;

import java.time.LocalDate;

public class EmployeeTest {

    @Test
    public void accountantTest() {
        Accountant accountant = new Accountant();

        accountant.setName("Maria");
        accountant.setLastName("Znamenskaya");
        accountant.setSalary(50000);
        accountant.setDateOfBirth(LocalDate.of(2000, 12, 23));
        accountant.setGender(Gender.FEMALE);

        accountant.work();
        accountant.manageAProject();

        System.out.println(accountant);
    }

    @Test
    public void accountantLeadTest() {
        AccountantLead accountantLead = new AccountantLead();

        accountantLead.setName("Maria");
        accountantLead.setLastName("Znamenskaya");
        accountantLead.setSalary(50000);
        accountantLead.setDateOfBirth(LocalDate.of(2000, 12, 23));
        accountantLead.setGender(Gender.FEMALE);

        accountantLead.work();
        accountantLead.manageAProject();
        accountantLead.toLead();

        System.out.println("Old salary: " + accountantLead.getSalary());
        accountantLead.salaryBonus();
        System.out.println("New salary: " + accountantLead.getSalary());
    }

    @Test
    public void managerTest() {
        Manager manager = new Manager();

        manager.setName("Maria");
        manager.setLastName("Znamenskaya");
        manager.setSalary(50000);
        manager.setDateOfBirth(LocalDate.of(2000, 12, 23));
        manager.setGender(Gender.FEMALE);

        manager.work();
        manager.manageAProject();
        manager.presentProduct("Apple");

        System.out.println(manager);
    }

    @Test
    public void programmerTest() {
        Programmer programmer = new Programmer();

        programmer.setName("Maria");
        programmer.setLastName("Znamenskaya");
        programmer.setSalary(50000);
        programmer.setDateOfBirth(LocalDate.of(2000, 12, 23));
        programmer.setGender(Gender.FEMALE);
        programmer.setCategory(CategoryOfProgrammers.BACKEND);
        programmer.setRank(Rank.MIDDLE);

        programmer.work();
        programmer.writeCode();

        System.out.println(programmer);
    }

    @Test
    public void bossTest() {
        Boss boss = new Boss();

        Programmer programmer = new Programmer();
        programmer.setName("Maria");
        programmer.setLastName("Znamenskaya");
        programmer.setSalary(5000);

        Manager manager = new Manager();
        manager.setName("John");
        manager.setLastName("Smith");
        manager.setSalary(2300);

        System.out.println("Old salary - programmer:\t" + programmer.getSalary()
                + "\n\t\t\t manager:\t\t" + manager.getSalary());

        boss.salaryUp(programmer);
        boss.salaryUp(manager);

        System.out.println("New salary - programmer:\t" + programmer.getSalary()
                + "\n\t\t\t manager:\t\t" + manager.getSalary());
    }
}
