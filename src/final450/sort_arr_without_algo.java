package final450;

import java.util.Arrays;

public class sort_arr_without_algo {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 0, 2, 0, 1, 1};
        int count = 0;
        int flag = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 0)
                count++;
            else if (arr[i] == 1)
                flag++;
        }
        for (int i = 0; i < arr.length; ++i) {
            if (i < count)
                arr[i] = 0;
            else if (i < count + flag)
                arr[i] = 1;
            else
                arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
