package week6;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setSalary(3000);
        manager.setName("Bob");

        SeniorManager senior = new SeniorManager();
        senior.setProjectName("123");

        senior.raiseTheSalary(manager);

        Boss boss = new Boss();

        boss.setNewProject(senior, "456");

        System.out.println(manager);
        System.out.println(senior.getProjectName());
    }
}
