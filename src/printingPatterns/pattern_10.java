package printingPatterns;

import java.util.Scanner;

public class pattern_10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int row = 1;
        int space = row - 1;
        int star = 2 * n - 1;
        while (row <= n) {
            int i = 1;

            while (i <= space) {
                System.out.print("  ");
                ++i;
            }
            int j = 1;

            while (j <= star) {
                System.out.print("* ");
                ++j;
            }
            ++space;
            star -= 2;
            System.out.println();
            ++row;
        }
    }
}
