package final450_string;

import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String st = obj.nextLine();
        String st2 = "";
        for (int i = st.length() - 1; i >= 0; --i) {
            st2 += st.charAt(i);
        }
        System.out.println(st2);
        System.out.println(st);
    }
}
