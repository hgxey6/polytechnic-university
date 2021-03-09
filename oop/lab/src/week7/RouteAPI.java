package week7;

import java.util.Set;

public interface RouteAPI {

    void addNewRoute(String route);
    Set<String> getAllRoutes();
    void deleteThisRoute(String route);

}
