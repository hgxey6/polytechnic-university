import edu.project.actions.Leadership;
import edu.project.person.Employee;
import edu.project.person.careers.*;
import edu.project.person.enums.Gender;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectOrientationTest {
    @Test
    public void encapsulationCheck() {

        Employee employee = new Manager();
        employee.setName("John");
        employee.setLastName("Smith");
        employee.setDateOfBirth(LocalDate.of(1999, Month.JANUARY, 23));
        employee.setGender(Gender.MALE);
        employee.setSalary(3000);

        System.out.println("Employee name: " + employee.getName());
        System.out.println("Employee lastname: " + employee.getLastName());
        System.out.println("Employee birthday: " + employee.getDateOfBirth());
        System.out.println("Employee gender: " + employee.getGender());
        System.out.println("Employee salary: " + employee.getSalary());

        employee.work();
    }

    @Test
    public void polymorphismCheck1() {
        List<Employee> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new Manager(),
                new Programmer(),
                new Accountant(),
                new ManagerLead()
        ));

        for(Employee e : list) {
            e.work();
        }
    }

    @Test
    public void polymorphismCheck2() {
        List<Leadership> leads = new ArrayList<>();
        leads.addAll(Arrays.asList(
                new ManagerLead(),
                new ProgrammerLead(),
                new AccountantLead()
        ));

        for(Leadership l : leads) {
            l.toLead();
            l.salaryBonus();
        }
    }

    @Test
    public void inheritanceCheck() {

        Employee x1 = new ProgrammerLead();
        Programmer x2 = new ProgrammerLead();
        ProgrammerLead x3 = new ProgrammerLead();

        System.out.println(x1.getClass().getName());
        System.out.println(x2.getClass().getName());
        System.out.println(x3.getClass().getName());
        
    }
}
