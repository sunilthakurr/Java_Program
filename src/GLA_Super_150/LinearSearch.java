package GLA_Super_150;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        int target = obj.nextInt();
        System.out.println(linearSearch(arr, target));

    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

}
