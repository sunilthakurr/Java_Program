package Recursion_2;

import java.util.Arrays;
import java.util.Scanner;

public class returnKeypadCode {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number whose keypad combination you want to know");
        int num = obj.nextInt();
        System.out.println(Arrays.toString(keypad(num)));

    }

    public static String[] keypad(int num) {
        if (num == 0) {
            return new String[]{""};
        }
        String[] strAns = keypad(num / 10);
        double digitCount = Math.log(num) + 1;
        String numString = setOfCharacter(num % 10);
        String[] ans = new String[(int) Math.pow(4.00, digitCount)];
//        String []ans = new String[(int)Math.pow(4.00, numString.length())];
//        for(int i = 0; i < strAns.length; ++i){
//            ans[i] = strAns[i];
//        }
        int k = 0;
        for (int i = 0; i < numString.length(); ++i) {
            for (int j = 0; j < strAns.length; ++j) {
                ans[k++] = strAns[j] + numString.charAt(i);
            }
        }
//        return ans;
        int count = 0;
        for (int i = 0; i < ans.length; ++i) {
            if (ans[i] == null)
                count++;
        }
        String[] res = new String[ans.length - count];
        for (int i = 0; i < res.length; ++i) {
            res[i] = ans[i];
        }
        return res;

    }

    public static String setOfCharacter(int n) {
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
