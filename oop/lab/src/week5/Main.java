package week5;

public class Main {
    public static void main(String[] args) {
        Businessman businessman1 = new Businessman("Джон");

        Businessman businessman2 = new Businessman("Тревор", 5000);

        businessman1.setSalary(3000);
        System.out.println("Зарплата первого бизнесмена " + businessman1.getSalary());

        System.out.println(businessman2);

        businessman2.toSell();
        businessman2.toSell("Яблоко");
    }
}
