package week4;

import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("input n: ");
        int n = scanner.nextInt();

        System.out.println("input matrix " + n + "x" + n + ": ");
        int[][] matrix = inputMatrix(n);

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    sum += matrix[i][j];
                }
                System.out.println(sum);
            }
        }

    }

    public static int[][] inputMatrix(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
