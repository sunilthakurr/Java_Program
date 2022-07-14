package searching_and_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class cyclic_sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = obj.nextInt();
        }
        String s1 = "abacus";
        String s2 = "pointer";
        System.out.println(s1.compareTo(s2));
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicst(int[] arr) {
        int i = 0, temp;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else
                ++i;
        }
    }
}
