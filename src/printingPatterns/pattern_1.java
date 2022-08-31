package printingPatterns;

//  ******
//  ******
//  ******
//  ******
//  ******

public class pattern_1 {
    public static void main(String[] args) {
        int n = 1;
        while (n <= 5) {
            int star = 1;
            while (star <= 5) {
                System.out.print("* ");
                ++star;
            }
            System.out.println();
            ++n;
        }
    }
}
