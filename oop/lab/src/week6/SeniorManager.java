package week6;

public class SeniorManager extends Manager implements ManagementEmployee {

    private String projectName;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public void raiseTheSalary(Manager manager) {
        double salary = manager.getSalary();
        salary += 500;
        manager.setSalary(salary);
    }

    @Override
    public void loverTheSalary(Manager manager) {
        double salary = manager.getSalary();
        if (salary > 700) {
            salary -= 400;
            manager.setSalary(salary);
        }
    }
}
