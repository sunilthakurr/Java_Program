package Stack;


public class StackUse {
    public static void main(String[] args) throws StackFullException {
        StackUsingArray stack = new StackUsingArray(3);

        for (int i = 1; i <= 5; ++i) {
            stack.push(i);
        }
        System.out.println("Size of Stack is : " + stack.size());
        while (!stack.isEmpty()) {
            try {

                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                //never reaches here
            }
        }
        System.out.println("Size of Stack is : " + stack.size());
    }
}
