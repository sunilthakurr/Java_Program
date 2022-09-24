package college_3rdSem;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1, 3, 1, 3, 2, 4, 422, -99};
        Reverse(arr);
    }

    public static void Reverse(int[] arr) {

        int temp;
//        int j = arr.length - 1;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; ++i, --j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
//        for(int i = 0; i < arr.length; ++i){
//            System.out.print(arr[i]+" ");
//        }
        System.out.println(Arrays.toString(arr));

    }
}
