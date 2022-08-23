package linkedList;

public class deleteNode {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput_OptimisedMethod.takeInput();
        head = deleteNode(head, 2);
        printLinkedList2.print(head);

    }

    public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
        if (head == null)
            return head;
        if (pos == 0)
            return head.next;

        int count = 0;
        Node<Integer> temp = head;

        while (count < pos - 1 && temp != null) {
            temp = temp.next;
            ++count;
        }
        // temp.next should not be null otherwise it will throw null pointer exception next two
        // line is used to return the head before entering the exception
        if (temp == null || temp.next == null)
            return head;


        temp.next = temp.next.next;
        return head;
    }
}
