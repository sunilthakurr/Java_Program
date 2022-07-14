package oops;

class parametrized {
    int a;
    String b;
    int c;
    int d;

    parametrized(int x, String y) {         // parametrized constructor
        a = x;
        b = y;
    }

    parametrized(int x, int y) {         // parametrized constructor
        c = x;
        d = y;
    }

    void show() {
        System.out.println(a + " " + b);
    }

    void disp() {
        System.out.println(c + " " + d);
    }
}

public class parametrized_constructor {
    public static void main(String[] args) {
        parametrized obj = new parametrized(100, "Sunil");
        obj.show();
        parametrized obj1 = new parametrized(100, 200);
        obj1.disp();
    }
}
