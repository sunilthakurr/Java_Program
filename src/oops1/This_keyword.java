package oops1;

class This {
    int rollNumber;
    String name;

    char section;

    public This(int rollNumber, String name) {
        // here we use this to set value of data member to local member having same name
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public This(int rollNumber, String name, char section) {
        // here we doesn't use this keyword due to which we are not able to set the value of data member
        rollNumber = rollNumber;
        name = name;
        section = section;
    }

    void print() {
        System.out.println(name + " : " + rollNumber);
    }

    void print2() {
        System.out.println(name + " " + rollNumber + " " + section);
    }


}

public class This_keyword {
    public static void main(String[] args) {
        This obj = new This(49, "Sunil");
        obj.print();

        This o2 = new This(49, "Sunil", 'F');
        o2.print2();
    }


}
