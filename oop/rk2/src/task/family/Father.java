package task.family;

public class Father extends Grandfather {

    private static Father instance;

    private Father() {
    }

    public static Father getInstance() {
        if (instance == null) {
            instance = new Father();
        }

        return instance;
    }
}
