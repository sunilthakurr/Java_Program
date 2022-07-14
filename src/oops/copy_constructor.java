package oops;


class copy {

    int a;
    String b;

    copy() {                             // default constructor
        a = 10;
        b = "Sunil";
        System.out.println(a + " " + b);
    }

    copy(copy ref) {                     // copy constructor :- copy the data of default constructor here using reference ref
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        copy obj3 = new copy();
        copy obj4 = new copy(obj3);        // here we copy data of object obj3 to object obj4 using copy constructor
    }
}
