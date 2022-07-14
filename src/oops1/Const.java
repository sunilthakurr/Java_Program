package oops1;

import java.util.Scanner;

class Constructor {
    public String name;
    private int rollNumber;

    //    we can create as much constructor as we want
    public Constructor() {          // we can also set constructor which sets the value
        rollNumber = 100;
    }

    public Constructor(String s, int rn) {
        name = s;
        rollNumber = rn;
    }

    public Constructor(int rn) {
        rollNumber = rn;
    }

    public void print() {
        System.out.println(name + " : " + rollNumber);
    }


}

public class Const {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        int rn = obj.nextInt();

        Constructor object = new Constructor(s, rn);
        object.print();

        Constructor object2 = new Constructor(rn);
        object2.print();


    }


}
