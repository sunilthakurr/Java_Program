package oops;


class copy_prac {
    int x;
    int y;

    copy_prac(int a, int b) {
        x = a;
        y = b;

    }

    copy_prac(copy_prac ref) {
        x = ref.x;
        y = ref.y;
        System.out.println(x + " " + y);
    }

    void display() {
        System.out.println(x + " " + y);
    }
}

public class copy_constructor_practice {

    public static void main(String[] args) {
        copy_prac obj5 = new copy_prac(10, 20);
        obj5.display();
        copy_prac obj6 = new copy_prac(obj5);
    }
}
