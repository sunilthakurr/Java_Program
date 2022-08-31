package printingPatterns;

import java.util.Scanner;


public class pattern_11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int row = 1;
        int space = n - 1;
        int star = 1;

        while (row <= n) {
            int j = 1;
            while (space >= j) {
                System.out.print(" ");
                ++j;
            }
            int i = 1;
            while (i <= star) {
                System.out.print("* ");
                ++i;
            }
            System.out.println();
            ++row;
            ++star;
            --space;
        }


    }
}
