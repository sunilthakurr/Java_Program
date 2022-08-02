package CHEGG;

import java.util.Scanner;

public class DecodeString {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        System.out.println(decodeString(s));

    }

    public static String decodeString(String s) {
        int i = 0, j = s.length();
        String result = helper(i, j, s.toCharArray());
        return result;
    }

    private static String helper(int begin, int end, char[] s) {
        if (begin == end)
            return "";
        StringBuilder current = new StringBuilder("");
        while (begin < end) {
            if (Character.isAlphabetic(s[begin])) {
                current.append(s[begin]);
                begin++;
            } else if (s[begin] > '0' && s[begin] <= '9') {
                int a = begin + 1;
                int loop = s[begin] - '0';
                while (s[a] != '[') {
                    loop = loop * 10 + s[a] - '0';
                    a++;
                }
                int left = 1;
                int right = 0;

                int k = a + 1;
                while (k < end) {
                    if (s[k] == '[')
                        left++;
                    else if (s[k] == ']')
                        right++;
                    if (left == right)
                        break;
                    k++;
                }

                String ret = helper(a + 1, k, s);
                for (int l = 0; l < loop; l++) {
                    current.append(ret);
                }
                begin = k + 1;
            }
        }
        return current.toString();
    }
}

