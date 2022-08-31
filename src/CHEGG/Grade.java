package CHEGG;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        if (a >= 75)
            System.out.println("Grade : A");
        else if (a >= 65)
            System.out.println("Grade : B");
        else if (a >= 55)
            System.out.println("Grade : C");
        else if (a >= 45)
            System.out.println("Grade : Pass");
        else
            System.out.println("Grade : Fail");
    }
}
