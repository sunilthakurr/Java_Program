package oops2;

class vechile3 {
    int maxSpeed;
    String brand;
    String color;

    void print() {
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("brand : " + brand);
        System.out.println("color : " + color);
    }

}

class bike extends vechile3 {
    int noOfGears;


    void print() {
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("brand : " + brand);
        System.out.println("color : " + color);
        System.out.println("noOfGears : " + noOfGears);
    }

}

public class FunctionOverloading {
    public static void main(String[] args) {

        vechile3 v3 = new vechile3();
        v3.print();         // here print function of vechile class will be called
        System.out.println("--------------------------------------------------------------------------");
        bike b = new bike();
        b.print(); // here print function of bike class will be called because it will firstly check in
//                      car class that is print function is available here if not then it will check its
//                      parent class and if it is not avaiable there then it will check parent class of vechile3
//                      and so on.

    }
}
