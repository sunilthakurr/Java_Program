package oops2;

class vechile {
    String brandName;
    int maxSpeed;
    String color;


    void print() {
        System.out.println("brandname : " + brandName);

        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("color : " + color);
    }


}

class car extends vechile {
    boolean isConvertible;
    int numGears;

    String carName;

    void display() {
        System.out.println("brandname : " + brandName);
        System.out.println("carName : " + carName);
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("color : " + color);
        System.out.println("isConvertible : " + isConvertible);
        System.out.println("Number of Gears : " + numGears);
    }

}

public class InheritanceBasics {
    public static void main(String[] args) {
        vechile v = new vechile();

//        v.print();

        car c = new car();
        c.color = "black";
        c.brandName = "Toyota";
        c.carName = "Fortuner";
        c.maxSpeed = 190;
        c.isConvertible = true;
        c.numGears = 6;

//        c.print();
        c.display();

    }
}
