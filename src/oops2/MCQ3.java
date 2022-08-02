package oops2;

class Carz {
    private int seats;
    private int speed;

    void print() {
        System.out.println("Carz");
    }

}

class Audi extends Carz {
    void print() {
        System.out.println("Audi");
    }
}

public class MCQ3 {
    public static void main(String[] args) {
        Carz a = new Audi();
        a.print();

    }
}
