package oops;

class trial3 {
    int x;
    String y;
}

class trial2 {
    String x;
    float y;
}

class trial {
    int a;
    String b;

    void print() {
        System.out.println(a + " " + b);
        System.out.println("print method is working fine");
    }
}

public class class_and_object {
    public static void main(String[] args) {
        trial obj1 = new trial();

        obj1.print();
        obj1.a = 100;
        obj1.b = "Sunil";
        System.out.println(obj1.a + " " + obj1.b);


        trial3 obj2 = new trial3();
        obj2.x = 144;
        obj2.y = "Alice";
        System.out.println(obj2.x + " " + obj2.y);


        trial3 obj3;
        obj3 = new trial3();
        obj3.x = 196;
        obj3.y = "Bob";
        System.out.println(obj3.x + " " + obj3.y);


        trial2 obj4 = new trial2();
        obj4.x = "Sunil";
        obj4.y = (float) 8.2;
        System.out.println(obj4.x + " " + obj4.y);
    }

}


