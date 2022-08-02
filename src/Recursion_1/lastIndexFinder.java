package Recursion_1;

import java.util.Scanner;

public class lastIndexFinder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter element whose last index you want to know");
        int target = obj.nextInt();
        int result = lastIndexFinder(arr, target, arr.length - 1);
        System.out.println(result);

    }

    public static int lastIndexFinder(int[] input, int target, int index) {

        if (index < 0)
            return -1;

        if (input[index] == target)
            return index;

        return lastIndexFinder(input, target, --index);
    }
}
