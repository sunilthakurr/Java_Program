package oops1;

public class testing {
    static int marks;

    void set_marks(int marks) {
        this.marks = marks;               //Line 1
    }

    class test1 {
        public static void main(String[] args) {
            testing t = new testing();
            t.set_marks(78);                //Line 2
            System.out.print(Test.marks);
        }

    }
}
