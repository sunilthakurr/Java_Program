package Recursion_2;

import java.util.Scanner;

public class printSubsequenceOfString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter string whose subsequences you want to know");
        String str = obj.next();
        printSubsequences(str);

    }

    public static void printSubsequences(String input) {

        printSubsequences(input, "");

    }

    public static void printSubsequences(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        printSubsequences(input.substring(1), output);
        printSubsequences(input.substring(1), output + input.charAt(0));
    }
}
