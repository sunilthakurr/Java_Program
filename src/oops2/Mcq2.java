package oops2;

class Vechile {
    public void Print() {
        System.out.print("Vehicle's Print() ");
    }
}

class FourWheelers extends Vechile {
    public void Print() {
        System.out.print("FourWheelers's Print() ");
    }
}

class Car extends FourWheelers {
    public void Print() {
        System.out.print("FourWheelers's Print() ");
    }
}

public class Mcq2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.Print();
    }
}
