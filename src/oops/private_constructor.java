package oops;

class privateC {

    int a;
    double b;
    String c;

    private privateC() {                     // private constructor
        a = 10;
        b = 87.8;
        c = "Sunil";
        System.out.println(a + " " + b + " " + c);
    }

    static void display2() {             // we can also use data of private constructor in other
        System.out.println();          // method by using static keyword but method should be
        // in same class

    }

    public static void main(String[] args) {
        privateC obj6 = new privateC();
    }
}

public class private_constructor {
//    public static void main(String[] args) {   // it will throw error as we cannot access private constructor
//        privateC obj6 = new privateC();
//    }
}
