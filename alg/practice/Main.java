import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int y = 0; // енгизилетин сан
        int sum = 0; // барлык сандар суммасы
        while (y != 999) { // егер сан 999 тен болса токтату
            y = scanner.nextInt(); // санды оку
            sum ++; // сумманы осиру
        }
        sum --; // сонгы 999 ды окымаймыз, сол ушин азайту

        System.out.println(sum + " значении"); 
    }
}