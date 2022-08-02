package Recursion_1;

import java.util.Scanner;

public class printNumbers {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        print(N);
    }

    public static void print(int N) {
        if (N == 0)
            return;
        print(N - 1);
        System.out.println(N + " ");
    }
}
