package college_3rdSem;

public class Max_Value {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5, 11};
        System.out.println(maxFinder(arr));
    }

    public static int maxFinder(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
