package final450;

import java.util.Scanner;

public class max_min_of_arr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();               // taking size of array from user
        int[] arr = new int[size];             // declaring the array
        System.out.println("Enter the elements of array");  // taking elements of array from user
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        int max = arr[0];              // supposing 0th element be maximum and minimum elements of array
        int min = arr[0];
        for (int i = 1; i < size; ++i) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        // displaying the maximum and minimum elements of array
        System.out.println("Maximum element in the array is " + max);
        System.out.println("Minimum element in the array is " + min);
    }
}
