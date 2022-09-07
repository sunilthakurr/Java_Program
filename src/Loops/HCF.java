package Loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int dividend = obj.nextInt();
        int divisor = obj.nextInt();
        System.out.println(GCD(dividend, divisor));
    }

    static int GCD(int a, int b) {
        int remainder = Math.min(a, b);

        while (remainder != 0) {
            if (a % remainder == 0 && b % remainder == 0)
                return remainder;
            --remainder;
        }
        return remainder;
    }
}
