package Array_2D;

import java.util.Scanner;

public class printUpperTriangularMatrix {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row = obj.nextInt();
        int col = obj.nextInt();
        int[][] arr = new int[row][col];

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                arr[i][j] = obj.nextInt();
            }
        }
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
                if (j >= i) {
                    System.out.print(arr[i][j] + " ");

                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
