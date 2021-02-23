package week5;

//    1. Sozdat’ klass dlya Biznesmnov
//    2. Dobavit’:
//          a. Dva konstruktora, oba ne pustye, oba doljny prinimat’ parametry I vypolnyat’ deistviya
//          b. Dva Svoistva
//              i. Privyazannaya k peremennoi get-set svoistvo
//              ii. Ne privyazannaya k peremennoi get-set svoistvo, I doljno byt’ tol’ko chitaemoi
//          c. Metod s peregruzkoi (2 shtuka):
//              i. Odin iz nih pustoi no ne doljen vernut’ znachenie
//              ii. Vtoroi ne pustoi no ne doljen vernut’ znachenie
//     3. Sozdat’ dva ob’ekta iz etogo klassa:
//            a. Odin iz pustogo konstruktora
//            b. Vtoroi iz ne pustogo konstruktora

public class Businessman {

    private String name;
    private double salary;


    // с параметром
    public Businessman(String name) {
        this.name = name;
    }

    public Businessman(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void toSell() {
        System.out.println("Бизнесмен " + this.name + " продал продукт");
    }

    public void toSell(String product) {
        System.out.println("Бизнесмен " + this.name + " продал " + product);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Businessman{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
