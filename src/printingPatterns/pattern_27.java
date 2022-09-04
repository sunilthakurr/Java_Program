package printingPatterns;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();
        int row = 1;
        int space = n - 1;
        int star = 1;
        while (row <= n) {
            int i = 1;

            while (i <= space) {
                System.out.print("  ");
                ++i;
            }
            int j = 1;
            int count = 1;
            while (j <= star) {
                System.out.print(count + " ");
                ++j;
                if (count < n / 2 + 1)
                    ++count;
                else
                    --count;
            }
            count = 1;
            --space;
            star += 2;
            System.out.println();
            ++row;
        }
    }
}
