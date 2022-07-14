package searching_and_sorting;

import java.util.Scanner;

public class order_agnostic_binary_search {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter element you want to search");
        int target = obj.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println(updated_binarysc(arr, target));

    }

    static int updated_binarysc(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;

        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[0] < arr[1]) {
                if (arr[mid] > target)
                    end = mid - 1;
                else if (arr[mid] < target)
                    st = mid + 1;
                else
                    return mid;
            } else {
                if (arr[mid] > target)
                    st = mid + 1;
                else if (arr[mid] < target)
                    end = mid - 1;
                else
                    return mid;
            }
        }
        return -1;
    }
}
