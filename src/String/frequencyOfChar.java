package String;
import java.util.Scanner;

public class frequencyOfChar {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.next();
        char[] str = st.toCharArray();
        int count;
        for (int i = 0; i < str.length; ++i) {
            count = 1;
            for (int j = i + 1; j < str.length; ++j) {
                if (str[i] == str[j]) {
                    ++count;
                    str[j] = '0';
                }
            }
            if (str[i] != '0')
                System.out.println(str[i] + " - " + count);
        }
    }
}
