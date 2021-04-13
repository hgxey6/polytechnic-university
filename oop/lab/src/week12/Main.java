package week12;

public class Main {
    public static void main(String[] args) {
        General general1 = General.getInstance();
        general1.setFirstname("Adam");
        general1.setLastname("Smith");
        general1.setSalary(5000);
        general1.setExperience(3);

        General general2 = General.getInstance();

        System.out.println("general1 hashcode: " + general1.hashCode());
        System.out.println("general2 hashcode: " + general2.hashCode());
        System.out.println(general1.equals(general2));


        Solder solder1 = new Solder();
        solder1.setName("Dan");

        Solder solder2 = new Solder();

        System.out.println("solder1 hashcode: " + solder1.hashCode());
        System.out.println("solder2 hashcode: " + solder2.hashCode());
        System.out.println(solder1.equals(solder2));
    }
}
