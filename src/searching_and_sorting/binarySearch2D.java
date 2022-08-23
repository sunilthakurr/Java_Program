package searching_and_sorting;

import java.util.Arrays;

public class binarySearch2D {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(Arrays.toString(search2D(arr, 2)));
    }


    public static int[] search2D(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] > target)
                --c;
            else if (matrix[r][c] < target)
                ++r;
        }
        return new int[]{-1, -1};

    }
}
