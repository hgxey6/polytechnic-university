package week12;

import java.util.Objects;

public class Solder {

    private String name;
    private int salary;

    public Solder() {
    }

    public Solder(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Solder{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solder solder = (Solder) o;
        return salary == solder.salary && Objects.equals(name, solder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
