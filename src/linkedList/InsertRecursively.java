package linkedList;

import java.util.Scanner;

public class InsertRecursively {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Node head = TakeInput_OptimisedMethod.takeInput();
        int element = obj.nextInt();
        int position = obj.nextInt();

        Node newHead = Insert(head, position, element);
        System.out.println(newHead);
//        printLinkedList2.print(newHead);
        printLLRecursive.printRR(newHead);

    }

    public static Node<Integer> Insert(Node head, int position, int element) {

        if (position == 0) {
            Node<Integer> newNode = new Node<>(element);
            newNode.next = head;
            return newNode;
        }

        if (head == null)
            return head;

        head.next = Insert(head, position - 1, element);
        return head;
    }
}
