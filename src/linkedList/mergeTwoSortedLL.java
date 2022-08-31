package linkedList;

public class mergeTwoSortedLL {
    public static void main(String[] args) {
        Node<Integer> head1 = TakeInput_OptimisedMethod.takeInput();
        Node<Integer> head2 = TakeInput_OptimisedMethod.takeInput();
        Node<Integer> newHead = mergeLL(head1, head2);
        printLinkedList2.print(newHead);
    }

    public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        Node<Integer> newHead, Node1 = head1, Node2 = head2, NewNode;

        int data1 = Node1.data;
        int data2 = Node2.data;

        if (data1 < data2) {
            newHead = Node1;
            Node1 = Node1.next;
        } else {
            newHead = Node2;
            Node2 = Node2.next;
        }
        NewNode = newHead;


        while (Node1 != null && Node2 != null) {
            data1 = Node1.data;
            data2 = Node2.data;

            if (data1 < data2) {
                NewNode.next = Node1;
                NewNode = NewNode.next;
                Node1 = Node1.next;
            } else {
                NewNode.next = Node2;
                NewNode = NewNode.next;
                Node2 = Node2.next;
            }

        }
        while (Node1 != null) {
            NewNode.next = Node1;
            NewNode = NewNode.next;
            Node1 = Node1.next;
        }
        while (Node2 != null) {
            NewNode.next = Node2;
            NewNode = NewNode.next;
            Node2 = Node2.next;
        }
        return newHead;
    }
}
