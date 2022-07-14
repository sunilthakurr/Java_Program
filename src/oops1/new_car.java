package oops1;

class car {
    static int year;
    String company_name;
}

public class new_car {
    public static void main(String[] args) {

        car c = new car();
        car.year = 2018;
        c.company_name = "KIA";

        car d = new car();
        System.out.println(d.year);

//        Year is of static type i.e. only one memory block of year is created ,
//        same for every object.
//        So, it would print 2018.
    }
}
