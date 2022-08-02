package oops2;

class vechile4 {
    int maxSpeed;
    String color;
    String brand;

    void print() {
        System.out.println("maxSpeed : " + maxSpeed);
        System.out.println("color : " + color);
        System.out.println("brand : " + brand);
    }


}

class train extends vechile4 {
    boolean isElectric;


    void print() {
        // here superKeyword is used to call variable maxSpeed from parent class

//        System.out.println("maxSpeed : "+maxSpeed);
//        System.out.println("color : "+color);
//        System.out.println("brand : "+brand);

//        here all upper things is alredy displayed in parent print method so we can just call that print
//        method using super keyword
        super.print();
        System.out.println("isElectric : " + isElectric);
    }

    void display() {
        //  here we use super keyword to call method of parent class using display method
        super.print();
    }


}

public class SuperKeyword {
    public static void main(String[] args) {
        train t = new train();
        t.maxSpeed = 100;
        t.color = "Red";
        t.brand = "Indian Railway";
        t.isElectric = true;
        t.print();              // it is going to call printfunction of train class(child class) but if we want to
//                                   to call the print function of vechile4 class (parent class) then we
//                                   use super keyword to access.
        System.out.println("------------------------------------------");
        t.display();


    }
}
