package rk1.firstTask;

public abstract class Human implements HumanBehavior {

    private int age;
    private double height;
    private String nationality;

    @Override
    public void eat() {
        System.out.println("Человек кушает");
    }

    @Override
    public void walk() {
        System.out.println("Человек ходит");
    }

    @Override
    public void sleep() {
        System.out.println("Человек спит");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Human() {
    }
}
