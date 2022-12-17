package pattern;

import java.util.Scanner;

public class zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        zigZag(arr, M, N);              // Your code here
    }

    public static void zigZag(int[][] arr, int m, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i - j][j] + " ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = m - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(arr[i - j][j - 1] + " ");

            }
            System.out.println();


        }
    }
}
