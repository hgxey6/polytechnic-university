package week4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println(swap(s));
    }

    public static String swap(String s) {

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length - 1; i+= 2) {
            char temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        return String.valueOf(array);
    }
}
