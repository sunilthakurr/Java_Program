package oops;

class trial4 {
    int a;
    String name;

    //    trial4(){          // constructor
//        a = 0; name = null;
//    }
    void display() {
        System.out.println(a + " " + name);
        System.out.println("display method is working fine");
    }
}

public class constructor {
    public static void main(String[] args) {
        trial4 obj5 = new trial4();
        obj5.a = -123;
        System.out.println(obj5.a);

        obj5.display();

    }
}
