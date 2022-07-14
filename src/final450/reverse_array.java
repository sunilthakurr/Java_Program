package final450;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();      // taking size of array from user
        int[] arr = new int[size];     // declaring an array

        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();        // taking elements of array from user
        }
        int temp;
        for (int i = 0; i < arr.length / 2; ++i) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
