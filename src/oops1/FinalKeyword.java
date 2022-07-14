package oops1;

import java.util.Scanner;

class Final {
    final int rollNumber;
    String name;


    public Final(int rn, String n) {
        rollNumber = rn;
        name = n;


    }

    void print() {
        System.out.println(name + " : " + rollNumber);
    }


}

public class FinalKeyword {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        int rn = obj.nextInt();
        String n = obj.next();

        Final o1 = new Final(rn, n);
        o1.print();


    }

}
