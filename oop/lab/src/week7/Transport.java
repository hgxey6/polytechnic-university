package week7;

import java.util.HashSet;
import java.util.Set;

public abstract class Transport implements TransportAPI, RouteAPI {

    private Set<String> routes;
    private int capacity;

    public Transport() {
        routes = new HashSet<>();
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
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

    @Override
    public void addCapacity(int capacity) {
        addCap(capacity);
    }

    private void addCap(int capacity) {
        this.capacity += capacity;
    }
}
