package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        System.out.println(nthFibo(N));
    }

    static int nthFibo(int N) {
        int first = 0;
        int second = 1;
        int result = 0;
        if (N <= 2)
            return N;
        for (int i = 2; i <= N; ++i) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
