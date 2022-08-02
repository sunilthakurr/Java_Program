package Recursion_1;

import java.util.Scanner;

public class arraySum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println(elementSum(arr, 0, 0));
    }

    public static int elementSum(int[] arr, int index, int sum) {
        if ((index + 1) >= arr.length)
            return sum + arr[index];

        sum += arr[index];
        index++;
        return elementSum(arr, index, sum);

    }
}
