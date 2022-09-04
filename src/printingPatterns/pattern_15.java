package printingPatterns;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int row = 1;
        int space = 0;
        int star = n;
        while (row <= 2 * n - 1) {
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
            if (row < n) {
                space += 2;
                --star;
                ++row;
            } else {
                space -= 2;
                ++star;
                ++row;
            }
            System.out.println();
        }
    }
}
