package Recursion_2;

import java.util.Scanner;

public class stringSubsequences {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        subsequences(str);

    }

    public static String[] subsequences(String str) {
        if (str.length() == 0) {
            String ans[] = {""};
            return ans;
        }
        String[] smallAns = subsequences(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        for (int i = 0; i < smallAns.length; ++i) {
            ans[i] = smallAns[i];
        }
        for (int i = smallAns.length; i < 2 * smallAns.length; ++i) {
            ans[i] = str.charAt(0) + smallAns[i - smallAns.length];
        }
        for (int i = 0; i < ans.length; ++i) {
            System.out.println(ans[i]);
        }
        return ans;
    }
}
