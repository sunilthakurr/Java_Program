package linkedList;

public class nodeInLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput_OptimisedMethod.takeInput();
        System.out.println(findNode(head, 4));
    }

    public static int findNode(Node<Integer> head, int n) {
        int count = 0;

        while (head != null) {
            if (head.data == n) {
                return count;

            }
            ++count;
            head = head.next;
        }
        return -1;
    }
}
