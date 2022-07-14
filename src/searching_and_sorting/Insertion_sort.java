package searching_and_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        int size = obj.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = obj.nextInt();
        }
        Insertionst(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Insertionst(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
}













