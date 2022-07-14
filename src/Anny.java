import java.util.ArrayList;
import java.util.Scanner;

public class Anny {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the upper limit");
        int n = obj.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(2);
        for (int i = 3; i < n; ++i) {
            for (int j = 2; j <= n / 2; ++j) {
                if (j % i != 0)
                    continue;
                else
                    list.add(i);
            }
        }

    }
}
