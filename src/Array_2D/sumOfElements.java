package Array_2D;

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int row_size, col_size;

        System.out.println("Enter the row_size of array");
        row_size = obj.nextInt();
        System.out.println("Enter the col_size of array");
        col_size = obj.nextInt();
        int[][] arr = new int[row_size][col_size];
        int sum = 0;

        System.out.println("Enter the elements of array");

        for (int i = 0; i < row_size; ++i) {
            for (int j = 0; j < col_size; ++j) {
                arr[i][j] = obj.nextInt();
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of elements of array is : " + sum);


    }
}
