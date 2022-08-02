package Recursion_1;

import java.util.Scanner;

public class firstIndexFinder {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter element whose first index you want to know");
        int target = obj.nextInt();
        int result = indexFinder(arr, target, 0);
        System.out.println(result);
    }

    public static int indexFinder(int[] input, int target, int index) {
        if (index + 1 == input.length)
            return -1;

        if (input[index] == target)
            return index;
        return indexFinder(input, target, ++index);
    }
}
