package linkedList;

public class printLLRecursive {
    public static void main(String[] args) {
        Node<Integer> head = TakeInput_OptimisedMethod.takeInput();
        printRR(head);
        System.out.println();
        printRev(head);

    }

    public static void printRR(Node<Integer> head) {
        if (head == null)
            return;

        System.out.print(head.data + " ");
        printRR(head.next);
    }

    public static void printRev(Node<Integer> head) {
        if (head == null)
            return;

        printRev(head.next);
        System.out.print(head.data + " ");
    }
}
