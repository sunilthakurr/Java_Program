package CHEGG;

import java.util.ArrayList;
import java.util.Scanner;


class Codechef {
    public static void main(String[] args) throws java.lang.Exception {

        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();
        int count;
        for (int i = 0; i < T; ++i) {
            int size = obj.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; ++j) {
                arr[j] = obj.nextInt();
            }
            count = 0;
            int sum = 0;
            //  Arrays.sort(arr);
            System.out.println(Counter(arr));


        }
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static int Counter(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>(1);


        int[] fr = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }


        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                list.add(fr[i]);
        }
        System.out.println(list);
        int temp = 0;
        for (int i = 0; i < list.size(); ++i) {
            int fan = list.get(i);
            if (fan > 1) {
                temp += factorial(fan) / 2 * factorial(fan - 2);
            }

        }
        return temp;
    }

}
