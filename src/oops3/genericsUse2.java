package oops3;

public class genericsUse2 {
    public static void main(String[] args) {
        genericsCreate<String> obj = new genericsCreate<>("Alice", "Bob");
        System.out.println(obj.getFirst());
        System.out.println(obj.getSecond());
        obj.setFirst("Alice Kumar");
        obj.setSecond("Bob Kumar");
        System.out.println(obj.getFirst());
        System.out.println(obj.getSecond());
    }
}
