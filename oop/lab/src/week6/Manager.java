package week6;

public class Manager {

    private String name;
    private String surname;
    private int age;
    private String departmentName;
    private double salary;

    public Manager() {
    }

    public Manager(String name, String surname, int age, String departmentName, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.departmentName = departmentName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void toWork() {
        System.out.println(name + " работает в " + departmentName);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
