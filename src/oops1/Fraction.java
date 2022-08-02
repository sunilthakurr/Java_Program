package oops1;

class zeroDivisionException extends Exception {

}

class Fract {

    int sm;
    private int num1;
    private int num2;

    Fract(int a, int b) {
        num1 = a;
        num2 = b;
    }


    Fract(Fract f1, Fract f3) {
        this.num1 = f1.num1 * f3.num2 + f3.num1 * f1.num2;
        this.num2 = f1.num2 * f3.num2;
    }

    private void valueChanger() {
        sm = Math.min(num1, num2);
        for (int i = 2; i <= sm; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                num1 /= i;
                num2 /= i;
            }
        }
    }

    void print() {
        valueChanger();

        if (num2 == 1)
            System.out.println(num1);
        else
            System.out.println(num1 + "/" + num2);

    }

    void setNumerator(int num1) throws zeroDivisionException {
        if (num1 == 0) {
            throw new zeroDivisionException();
            // or
            // zeroDivisionException e = new zeroDivisionException();
            // throw e;
        } else
            this.num1 = num1;
//        print();
    }

    int getDenominator() {
        valueChanger();
        return num2;
    }

    void setDenominator(int num2) throws Exception {
        if (num2 == 0) {
//            zeroDivisionException e = new zeroDivisionException("zero division error");
            Exception e = new Exception("zeroDivisionError");
            throw e;
        }
        this.num2 = num2;
    }

    void add(Fract f2) {

        this.num1 = this.num1 * f2.num2 + f2.num1 * this.num2;
        this.num2 = this.num2 * f2.num2;
        valueChanger();

    }

    //    void display(){
//        System.out.println(this.num1+" "+this.num2);
//    }
    void multiply(Fract f2) {
        this.num1 = this.num1 * f2.num1;
        this.num2 = this.num2 * f2.num2;
        valueChanger();
    }
}


public class Fraction {
    public static void main(String[] args) throws Exception {
        Fract f1 = new Fract(20, 30);
        f1.print();
        // 2/3


        try {
            f1.setNumerator(0);
        } catch (zeroDivisionException e) {
            System.out.println("hey please don't give 0 as numerator");
        }

        try {
            f1.setDenominator(0);
        } catch (zeroDivisionException exception) {

        } catch (Exception e) {
            System.out.println("Generic exception"); // handle all type of exception

        }


        int d = f1.getDenominator();
        System.out.println(d);
        // 1

        f1.print();
        // 4

        f1.setNumerator(10);
        f1.setDenominator(30);
        f1.print();
//      1/3

        Fract f2 = new Fract(3, 4);
        f1.add(f2);
        f1.print();
//      13/12

        f2.print();
//        3/4

        Fract f3 = new Fract(4, 5);
        f3.multiply(f2);
        f3.print();
//        3/5

        Fract f4 = new Fract(f1, f3);
        f4.print();


    }
}
