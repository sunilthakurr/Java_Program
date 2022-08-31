package printingPatterns;

//  *
//  * *
//  * * *
//  * * * *
//  * * * * *
public class pattern_2 {
    public static void main(String[] args) {

        int row = 1;
        while (row <= 5) {
            int star = 1;
            while (star <= 5) {
                if (star <= row)
                    System.out.print("* ");
                ++star;
            }
            ++row;
            System.out.println();
        }
    }
}
