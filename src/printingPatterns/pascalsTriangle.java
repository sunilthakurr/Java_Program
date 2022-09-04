package printingPatterns;

import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int row = 0;
        int star = n;

        while (row < n) {
            int i = 0;
            int val = 1;
            while (i <= row) {
                System.out.print(val + " ");
                val = ((row - i) * val) / (i + 1);
                ++i;
            }
            System.out.println();
            ++row;
        }

    }
}
