package Array_2D;

import java.util.Scanner;

public class transposeOfMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                A[i][j] = obj.nextInt();
            }
        }
        transpose(A, B, N);
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void transpose(int[][] A, int[][] B, int N) {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                B[i][j] = A[j][i];
            }
        }
    }
}
