package oops3;

public class genericsUse3 {
    public static void main(String[] args) {
        MultiplegenericsCreate2<Integer, String> obj1 = new MultiplegenericsCreate2<>(1, "Sunil Kumar");
        System.out.println(obj1.getFirst());
        System.out.println(obj1.getSecond());

        System.out.println("--------------------------------------------");

        MultiplegenericsCreate2<String, String> obj2 = new MultiplegenericsCreate2<>("Alice", "Bob");
        System.out.println(obj2.getFirst());
        System.out.println(obj2.getSecond());
    }
}
