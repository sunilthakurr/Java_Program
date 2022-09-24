package CHEGG;

import java.util.Arrays;
import java.util.Scanner;

class codechef {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {

            int size = obj.nextInt();
            int[] arr = new int[size];
            int[] arr2 = new int[size];
            for (int j = 0; j < size; ++j) {
                arr[j] = obj.nextInt();
                arr2[j] = arr[j];

            }
            Arrays.sort(arr2);
            int a = 0;
            int b = 0;
            for (int j = 0; j < size; ++j) {
                if (arr[j] != arr2[j]) {
                    a = j;
                    break;
                }

            }
            for (int j = size - 1; j >= 0; --j) {
                if (arr[j] < arr2[j]) {
                    b = j;
                    break;
                }

            }
            System.out.println(a + 1 + " " + b + 1);
        }
    }
}


