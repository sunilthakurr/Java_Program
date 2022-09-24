package CHEGG;

import java.util.Scanner;

public class isBoston {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        checkBoston(N);

    }

    public static void checkBoston(int N) {
        int sum = 0;
        int newNum = N;
        int newN = N;
        while (newNum != 0) {
            sum += newNum % 10;
            newNum /= 10;
        }
        System.out.println(sum);
        int rem = 2;
        int sum2 = 0;
        while (newN != 0) {
            if (newN % rem == 0) {
                sum2 += rem;
                newN /= rem;
            } else
                ++rem;
        }
        System.out.println(sum2);
    }
}
