package oops3;

public class genericsUse1 {
    public static void main(String[] args) {
        genericsCreate<Integer> obj = new genericsCreate<>(10, 20);
        System.out.println(obj.getFirst());
        System.out.println(obj.getSecond());
        obj.setFirst(1);
        obj.setSecond(2);
        System.out.println(obj.getFirst());
        System.out.println(obj.getSecond());
    }
}
