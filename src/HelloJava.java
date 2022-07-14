import java.util.Arrays;
import java.util.Scanner;

public class HelloJava {
    public static int range(int[] array) {
        // sorting the array using built-in method
        Arrays.sort(array);
        // storing value of 0th element in min_value as after sorting 0th element will be minimum value
        int min_value = array[0];
        // storing value of last element in max_value as after sorting 0th element will be maximum value
        int max_value = array[array.length - 1];
//    returning the difference between max_value and min_value
        return max_value - min_value;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            arr[i] = obj.nextInt();
        }
        System.out.println(range(arr));
    }
}
