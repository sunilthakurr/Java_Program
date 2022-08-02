package CHEGG;

import java.util.Scanner;

public class isSwitchOn {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        for (int i = 0; i < T; ++i) {
            int n = obj.nextInt();
            int count = 0;
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            for (int j = 0; j < n; ++j) {
                arr1[j] = obj.nextInt();
            }
            for (int j = 0; j < n; ++j) {
                arr2[j] = obj.nextInt();
            }
            for (int j = 0; j < n; ++j) {
                if (arr1[j] != arr2[j])
                    ++count;
            }
            if (count % 2 == 0)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
