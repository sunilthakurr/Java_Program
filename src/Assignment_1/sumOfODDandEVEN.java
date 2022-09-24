package Assignment_1;

import java.util.Scanner;

public class sumOfODDandEVEN {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        long num = obj.nextInt();
        short oddSum = 0;
        short evenSum = 0;
        byte count = 1;


        while (num != 0) {
            if (count % 2 == 0)
                evenSum += num % 10;
            else
                oddSum += num % 10;
            num /= 10;
            count++;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);


    }
}


//    Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
//
//        Input Format
//        Constraints
//        0 < N <= 1000000000
//
//        Output Format
//        Sample Input
//        2635
//        Sample Output
//        11
//        5
//        Explanation
//        5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.
//
//        Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
//
//        Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5