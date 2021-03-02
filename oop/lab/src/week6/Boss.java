package week6;

public class Boss extends SeniorManager implements ManagementProjects {


    @Override
    public void setNewProject(SeniorManager manager, String projectName) {
        manager.setProjectName(projectName);
    }
}
