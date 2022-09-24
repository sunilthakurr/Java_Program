package DataType;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        int rem = 0;
        int sum = 0;
        int mul = 1;
        while (N != 0) {
            rem = N % 2;          // mod by destination base ( applicable only when one base is 10)
            sum += rem * mul;
            N /= 2;              // divide by destination base
            mul *= 10;           // multiply by source base
        }
        System.out.println(sum);
    }
}
