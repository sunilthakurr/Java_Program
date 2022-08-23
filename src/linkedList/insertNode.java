package linkedList;

public class insertNode {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput_OptimisedMethod.takeInput();
        insert(head, 69, 2);
        printLinkedList2.print(head);

    }

    public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
        int count = 0;
        Node<Integer> newNode = new Node<>(data);

        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node<Integer> temp = head;
        while (count < pos - 1) {
            temp = temp.next;
            ++count;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;

    }
}
