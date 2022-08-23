package Recursion.Assignment_1;

import java.util.Scanner;

class solution {
    public static int convertStringToInt(String input) {
        if (input.length() == 1)
            return (input.charAt(0) - '0');

        double y = convertStringToInt(input.substring(1));

        double x = input.charAt(0) - '0';

        x = x * Math.pow(10, input.length() - 1) + y;
        return (int) x;


    }
}

public class StringToInteger {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = obj.nextLine();
        System.out.println(solution.convertStringToInt(input));
    }
}


