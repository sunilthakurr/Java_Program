package linkedList;

import java.util.Scanner;

public class TakeInput_NaiveMethod {
    public static void main(String[] args) {
        Node<Integer> head = takeInputNaive();
        printLinkedList2.print(head);

    }

    public static Node<Integer> takeInputNaive() {
        Node<Integer> head = null;
        Scanner obj = new Scanner(System.in);
        int data = obj.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = obj.nextInt();
        }
        return head;
    }
}

//Note :-
//        Time Complexity :- O(n^2)
