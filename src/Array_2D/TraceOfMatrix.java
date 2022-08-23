package Array_2D;

import java.util.Scanner;

public class TraceOfMatrix {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];
        int trace = 0;
        int reverseDiagonal = 0;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = obj.nextInt();
                if (i == j)
                    trace += arr[i][j];
                if (i + j == arr.length - 1 && i != j)
                    reverseDiagonal += arr[i][j];
            }
        }
        System.out.println(trace);
        System.out.println(reverseDiagonal + arr[(arr.length - 1) / 2][(arr.length - 1) / 2]);
    }
}
