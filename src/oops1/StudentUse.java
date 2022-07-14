package oops1;

class Student {
    String name;
    int rollNo;

    public Student() {
        System.out.println(rollNo + " " + name);
    }

    public Student(int num) {
        rollNo = num;
    }

    public void print() {
        System.out.print(name + " " + rollNo);
    }
}

public class StudentUse {
    public static void main(String[] args) {
        Student s = new Student();
        s.rollNo = 15;
        s.print();
    }
}
