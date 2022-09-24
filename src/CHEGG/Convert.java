package CHEGG;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {

        System.out.println("Enter the byte data");

        Scanner m = new Scanner(System.in);

        byte num = m.nextByte();

        System.out.println("Enter the integer data");

        int num2 = m.nextInt();

        System.out.println("Enter the long data");

        long num3 = m.nextLong();

        System.out.println("Enter the float data");

        float num4 = m.nextFloat();


        short num5 = (num);

        short num6 = (short) (num2);

        float num7 = (float) (num3);

        int num8 = (int) (num4);

        System.out.println("Byte data is converted into short data" + (num5));
        System.out.println("Integer data is converted into short data" + (num6));
        System.out.println("Long data is converted into float data" + (num7));
        System.out.println("Float data is converted into integer data" + (num8));


    }

}
