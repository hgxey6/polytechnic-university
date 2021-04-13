package week12;

import java.util.Objects;

public class General {

    private static General uniqueInstance;

    private String firstname;
    private String lastname;
    private int salary;
    private int experience;

    private General() {
    }

    public static General getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new General();
        }
        return uniqueInstance;
    }

    public int toCommand(int a) {
        return a;
    }

    public void cancelCommand(int a) {
        // TODO: some action
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "General{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        General general = (General) o;
        return salary == general.salary && experience == general.experience && Objects.equals(firstname, general.firstname) && Objects.equals(lastname, general.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, salary, experience);
    }
}
