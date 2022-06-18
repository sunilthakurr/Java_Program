package final450;

import java.util.Arrays;

public class arr_rotate_cyclic {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int temp = arr[0];
        System.arraycopy(arr, 1, arr, 0, arr.length - 1);
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));

    }
}

