package oops;

class A {
    int a;
    String b;
    boolean c;

    A() {                   // default constructor
        a = 100;
        b = "Sunil";          // we create default constructor manually because else compiler put the default value of all data types
        c = true;               // i.e; a = 0; b = null; c = false
    }

    void Disp() {               // creating method to display the value that we declare in default method
        System.out.println(a + " " + b + " " + c);
    }
}

public class default_constructor {


    public static void main(String[] args) {


        A obj = new A();               // creating a new object obj of class A
        obj.Disp();                    // calling the Disp method from obj

    }
}