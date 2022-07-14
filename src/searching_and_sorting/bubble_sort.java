package searching_and_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();

        }
        bubble_st(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void bubble_st(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
    }
}