package Recursion_1;

import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int B = obj.nextInt();
        System.out.println(power(A, B));
    }

    public static int power(int A, int B) {
        if (B == 0)
            return 1;
        else if (A == 0)
            return 0;
        return A * power(A, B - 1);
    }
}
