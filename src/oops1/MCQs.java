package oops1;

class Book {
    static int count;
    //    final int price = 10;        // final keyword is used to set it final we cannot change it by any means
    int price;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

public class MCQs {
    public static void main(String[] args) {
        System.out.print(Book.count + " ");
        Book b1 = new Book(500);
        Book b2 = new Book(600);
        System.out.println(Book.count);
    }
}
