package week3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println((a + b) / (Math.pow((Math.pow(a, y) + Math.pow(b, x)), 1. / (x + y))));
//        test();
    }

    public static void test() {
        System.out.println("Если a = 2, b = 2, y = 2, x = 1, то ответ должен быть равен 2");
//        int a = 2;
//        int b = 2;
//        int y = 1;
//        int x = 1;
//
//        System.out.println((a + b) / (Math.pow((Math.pow(a, y) + Math.pow(b, x)),  (1./(x + y)))));
    }
}
