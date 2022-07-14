package oops;

class overloading {
    int a;
    double b;
    String c;

    /* private overloading(){
    int a = 10; double b = 13.3; c = "ravi";
     */
    /* we cannot create default constructor and private constructor in a class
       because private constructor is also a one type of default constructor
     */
    overloading() {
        a = 100;
        b = 87.78;
        c = "Sunil";

    }

    overloading(int x) {
        a = x;
    }

    overloading(double y, String z) {
        b = y;
        c = z;
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        overloading obj7 = new overloading();
        overloading obj8 = new overloading(10);
        overloading obj9 = new overloading(90.89, "Ramu");
        System.out.println(obj7.a + " " + obj7.b + " " + obj7.c);
        System.out.println(obj8.a);
        System.out.println(obj9.b + " " + obj9.c);
    }
}
