package Recursion_2;

import java.util.Arrays;
import java.util.Scanner;

public class quickSort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of Array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        quickSorting(arr, 0, size - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSorting(int[] arr, int si, int ei) {
        if (si >= ei)
            return;
        int pivotpos = partition(arr, si, ei);
        quickSorting(arr, si, pivotpos - 1);
        quickSorting(arr, pivotpos + 1, ei);

    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[si];
        int count = 0;
        for (int j = si + 1; j <= ei; ++j) {
            if (arr[j] < pivot) {
                ++count;

            }
        }

        int temp = arr[count + si];
        arr[si + count] = pivot;
        arr[si] = temp;

        int i = si;
        int j = ei;

        while (i < j) {
            if (arr[si] < pivot) {
                ++i;
            } else if (arr[ei] >= pivot) {
                --j;
            } else {
                int flag = arr[i];
                arr[i] = arr[j];
                arr[j] = flag;
                ++i;
                --j;
            }
        }
        return si + count;
    }

}


