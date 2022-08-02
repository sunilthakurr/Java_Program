package oops1;

import java.util.Scanner;

class ComplexNumbers {
    int real;
    int imaginary;

    ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    void print() {
        if (imaginary >= 0)
            System.out.println(real + " + i" + imaginary);
        else
            System.out.println(real + " - i" + Math.abs(imaginary));

    }

    void plus(ComplexNumbers c2) {
        this.real += c2.real;
        this.imaginary += c2.imaginary;
    }

    void multiply(ComplexNumbers c2) {
        int real_temp = real;
        int imaginary_temp = imaginary;
        this.real = real_temp * c2.real - (imaginary_temp * c2.imaginary);
        this.imaginary = real_temp * c2.imaginary + imaginary_temp * c2.real;

    }

}

public class Complex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        } else {
            return;
        }
    }
}

