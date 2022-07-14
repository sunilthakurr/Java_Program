package demo;

import java.util.Random;
import java.util.Scanner;

public class chegg {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner obj = new Scanner(System.in);
        System.out.print("How many problems? ");
        int N = obj.nextInt();

        // int rand_int = rand.nextInt(5);

        for (int i = 0; i < N; ++i) {
            int first = rand.nextInt(1, 100);
            int second = rand.nextInt(1, 100);
            int rand_int = rand.nextInt(5);
            char op = randOperator(rand_int);
            int result = compute(op, first, second);

            switch (op) {
                case '+', '-' -> System.out.println(first + " " + op + " " + second + " = " + result);
                case '*' -> System.out.println(first + " " + op + " " + second + " = " + result);
                case '/' -> System.out.println(first + " " + op + " " + second + " = " + result);
                case '%' -> System.out.println(first + " " + op + " " + second + " = " + result);
            }
        }

    }

    static char randOperator(int rand_int) {

        return switch (rand_int) {
            case 0 -> '+';
            case 1 -> '-';
            case 2 -> '*';
            case 3 -> '/';
            case 4 -> '%';
            default -> '&';
        };
    }

    static int compute(char op, int first, int second) {
        return switch (op) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> first / second;
            case '%' -> first % second;
            default -> -1;
        };
    }
}