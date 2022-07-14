package final450;

import java.util.Arrays;
import java.util.Scanner;

public class kth_max_min_ele_of_arr {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the kth max and min element you want to know");
        int target = obj.nextInt();
        System.out.println("Enter the elements of array");
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(target + "th minimum element is " + arr[target - 1]);
        System.out.println(target + "th maximum element is " + arr[arr.length - target]);


    }
}
