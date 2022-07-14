package searching_and_sorting;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the element you want to search");
        int target = obj.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println(linearsc(arr, target));
    }

    static int linearsc(int[] arr, int target) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == target)
                return i;
        }
        return -1;

    }
}
