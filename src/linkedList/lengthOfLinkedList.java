package linkedList;

public class lengthOfLinkedList {
    public static void main(String[] args) {
        Node head = TakeInput_OptimisedMethod.takeInput();
        int length = length(head);
        System.out.println("length of linked list is :" + length);


    }

    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            ++count;
            head = head.next;
        }
        return count;
    }
}
