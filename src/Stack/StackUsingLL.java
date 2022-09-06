package Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackUsingLL<T> {
    private Node head;
    private int size;

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return getSize() == 0;
    }

    void push(int element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size += 1;
    }

    int pop() {
        if (head == null)
            return -1;
        else {
            int val = head.data;
            head = head.next;
            size -= 1;
            return val;
        }
    }

    int topElement() {
        if (head == null)
            return -1;
        else
            return head.data;
    }
}
