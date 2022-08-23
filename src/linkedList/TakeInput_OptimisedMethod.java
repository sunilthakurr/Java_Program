package linkedList;

import java.util.Scanner;

public class TakeInput_OptimisedMethod {
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList2.print(head);

    }

    public static Node<Integer> takeInput() {

        Scanner obj = new Scanner(System.in);
        Node<Integer> head = null;
        Node<Integer> tail = null;

        int data = obj.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            data = obj.nextInt();
        }
        return head;

    }
}


//Note :
//        Time Complexity :- O(n)
