package labWeek3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float[] arr = new float[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextFloat();
        }
        System.out.println(check(arr));
    }

    // Находит число, у которого самая большая дроб. часть
    public static float check(float[] array) {
        float max = 0.0f;
        float number = 0.0f;
        for (float d : array) {
            if (d % 1 > max) {
                max = d % 1;
                number = d;
            }

        }
        return number;
    }
}
