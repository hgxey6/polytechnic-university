package week7;

import java.util.HashSet;
import java.util.Set;

public abstract class FlightTransport implements RouteAPI {

    private Set<String> routes;

    public FlightTransport() {
        routes = new HashSet<>();
    }

    @Override
    public void addNewRoute(String route) {
        this.routes.add(route);
    }

    @Override
    public Set<String> getAllRoutes() {
        return routes;
    }

    @Override
    public void deleteThisRoute(String route) {
        this.routes.remove(route);
    }

    public abstract void info();
}
