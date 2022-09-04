package printingPatterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;


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
            // MIRRORING
            if (row < n) {
                --space;
                ++star;
                ++row;
            } else {
                ++space;
                --star;
                ++row;
            }
            System.out.println();
        }
    }
}
