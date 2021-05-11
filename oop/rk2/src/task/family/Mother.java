package task.family;

import task.pro.Housewife;

public class Mother extends Housewife {

    private static Mother instance;

    private Mother() {

    }

    public static Mother getInstance() {
        if (instance == null) {
            instance = new Mother();
        }

        return instance;
    }
}
