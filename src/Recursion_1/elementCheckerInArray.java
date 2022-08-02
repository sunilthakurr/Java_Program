package Recursion_1;

import java.util.Scanner;

public class elementCheckerInArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println("Enter the elements you want to search");
        int target = obj.nextInt();
        System.out.println(elementchecker(arr, 0, target));
    }

    public static boolean elementchecker(int[] arr, int index, int target) {
        if (index >= arr.length)
            return false;
        else if (arr[index] == target)
            return true;

        return elementchecker(arr, ++index, target);
    }
}
