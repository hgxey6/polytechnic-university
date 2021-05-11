package task;

import task.family.Daughter;
import task.family.Father;
import task.family.Mother;

public class Main {

    public static void main(String[] args) {
        Father father = Father.getInstance();

        Daughter daughter = new Daughter();
        daughter.play();
        daughter.run();

        Mother mother = Mother.getInstance();
        mother.clear();

    }
}
