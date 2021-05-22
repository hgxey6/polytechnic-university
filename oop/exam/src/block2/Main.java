package block2;

public class Main {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Red");
        pen.setSize(5);

        pen.draw();
        pen.write();
        pen.write("ABS");
    }
}
