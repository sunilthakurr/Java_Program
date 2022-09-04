package Stack;

class StackFullException extends Exception {

}

class StackEmptyException extends Exception {


    private static final long serialVersionUID = 1L;
}

class StackUsingArray {
    private int[] data;
    private int top;

    public StackUsingArray() {
        data = new int[10];
        top = -1;
    }

    public StackUsingArray(int size) {
        data = new int[size];
        top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int top() throws StackEmptyException {
        if (size() == 0) {
            // stack empty exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int element) throws StackFullException {

        if (size() == data.length) {
//            StackFullException f = new StackFullException();
//            throw f;

            doubleCapacity();
        }


        top++;
        data[top] = element;

    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i <= top; ++i) {
            data[i] = temp[i];
        }

    }

    public int pop() throws StackEmptyException {
        if (size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        int temp = data[top];
        top--;
        return temp;
    }
}
