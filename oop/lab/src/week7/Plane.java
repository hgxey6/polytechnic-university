package week7;

public class Plane extends FlightTransport {
    @Override
    public void info() {
        System.out.println("Plane["+ "routes: "+ getAllRoutes() + "]");
    }
}
