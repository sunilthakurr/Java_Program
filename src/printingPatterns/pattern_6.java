package printingPatterns;

import java.util.Scanner;

//* * * * *
//    * * * *
//        * * *
//            * *
//                 *
public class pattern_6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int row = 1;
        int space = 0;
        int star = n;
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
            space += 2;
            --star;
            System.out.println();
            ++row;
        }
    }
}
