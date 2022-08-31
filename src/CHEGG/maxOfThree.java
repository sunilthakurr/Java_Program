package CHEGG;

import java.util.Scanner;

public class maxOfThree {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();

        if (a > b && a > c)
            System.out.println(a + " is greatest");
        else if (b > c)
            System.out.println(b + " is greatest");
        else
            System.out.println(c + " is greatest");
    }
}
