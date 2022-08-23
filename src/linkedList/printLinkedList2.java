package linkedList;

public class printLinkedList2 {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        node1.next = node2;
        node2.next = node3;
        Node<Integer> head = node1;
        print(head);

    }

    static void print(Node<Integer> head) {

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
