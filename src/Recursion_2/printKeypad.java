package Recursion_2;

import java.util.Scanner;

public class printKeypad {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        printKeypad(num, "");
    }

    public static void printKeypad(int num, String str) {
        if (num == 0) {
            System.out.println(str);
            return;
        }
        String st = helper(num % 10);
        for (int i = 0; i < st.length(); ++i) {
            printKeypad(num / 10, st.charAt(i) + str);
        }

    }

    public static String helper(int n) {
        switch (n) {
            case 2:
                return "abc";

            case 3:
                return "def";

            case 4:
                return "ghi";

            case 5:
                return "jkl";

            case 6:
                return "mno";

            case 7:
                return "pqrs";

            case 8:
                return "tuv";

            case 9:
                return "wxyz";

            default:
                break;
        }
        return "";
    }

}
