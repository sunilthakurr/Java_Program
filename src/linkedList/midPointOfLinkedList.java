package linkedList;

public class midPointOfLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput_OptimisedMethod.takeInput();
        System.out.println(midPoint(head).data);

    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
