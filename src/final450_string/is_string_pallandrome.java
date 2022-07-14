package final450_string;

import java.util.Scanner;

public class is_string_pallandrome {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine();
        System.out.println(is_pallandrome(s1));

    }

    static boolean is_pallandrome(String s1) {
        for (int i = 0, j = s1.length() - 1; i < s1.length() / 2; ++i, --j) {
            if (s1.charAt(i) != s1.charAt(j))
                return false;

        }
        return true;
    }
}
