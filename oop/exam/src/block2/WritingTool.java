package block2;

public abstract class WritingTool implements Writeable {

    private String color;
    private int size;

    public WritingTool() {
    }

    public WritingTool(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void write() {
        System.out.println("Write");
    }

    @Override
    public void write(String word) {
        System.out.println(word);
    }

    public abstract void draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
