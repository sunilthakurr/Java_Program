package college_3rdSem;


class Student {
    String name;
    long roll;
    int age;

    public Student(String Name, long Roll, int Age) {
        name = Name;
        roll = Roll;
        age = Age;
    }

}

public class basicsOfClass {

    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);


        Student s2 = new Student("Ravi", 16, 21);
        System.out.println(s2.name);
        System.out.println(s2.roll);
        System.out.println(s2.age);

    }
}
