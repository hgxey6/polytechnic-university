package week7;

public class Train extends Transport {

    @Override
    public void info() {
        System.out.println("Train["+ "capacity:" + getCapacity()  + "|| Routes: "+ getAllRoutes() + "]");
    }
}
