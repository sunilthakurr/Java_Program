package oops3;

import java.util.Arrays;

public class genericPrintArray {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[10];
        for (int i = 0; i < arr1.length; ++i) {
            arr1[i] = i + 10;
        }
        String[] arr2 = new String[10];
        Arrays.fill(arr2, "abc");

        printArray(arr1);
        printArray(arr2);

    }

    public static <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// we use generic print to print all types of array i.e, int,String, double, char etc.
