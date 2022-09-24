package Queue;

import java.util.ArrayList;

public class gfgIplMatch {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int n = 9;
        int k = 3;
        List = max_of_subarrays(arr, n, k);

    }

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        int si = 0;
        int ei = si + k;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n - k; ++i) {
            list.add(max(arr, si, ei));
            si += 1;
            ei += 1;
        }
        return list;
    }

    public static int max(int[] arr, int si, int ei) {
        int max = arr[si];
        for (int i = si + 1; i <= ei; ++i) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
