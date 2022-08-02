package oops2;

class vechile2 {
    String brand;
    int color;
    private int maxSpeed;

    int getMaxSpeed() {
        return maxSpeed;
    }

    void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}

class bicycle extends vechile2 {
    boolean chargable;

    void print() {
        System.out.println("brand : " + brand);
        System.out.println("maxSpeed : " + getMaxSpeed());
        System.out.println("chargable : " + chargable);
    }
}

public class InheritanceANDPrivateMembers {
    public static void main(String[] args) {

        bicycle b = new bicycle();
        b.chargable = true;
        b.setMaxSpeed(40);
        b.brand = "Hero";

        b.print();

    }
}
