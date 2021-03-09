package week7;

public class Test1 {
    public static void main(String[] args) {
        Train train = new Train();
        train.setCapacity(50);

        train.addNewRoute("Boston");
        train.addNewRoute("Martin");
        train.addNewRoute("Qwerty");

        train.info();

        train.deleteThisRoute("Martin");

        train.info();


        Plane plane = new Plane();
        plane.addNewRoute("Moscow");
        plane.addNewRoute("Astana");
        plane.addNewRoute("Tokyo");
        plane.addNewRoute("Paris");

        System.out.println(plane.getAllRoutes());
    }
}
