package Recursion_1;

import java.util.Scanner;

public class noOfDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        System.out.println(digitCount(N));
    }

    public static int digitCount(int N) {
        if (N % 10 == 0)
            return 1;
        return 1 + digitCount(N / 10);
    }
}
