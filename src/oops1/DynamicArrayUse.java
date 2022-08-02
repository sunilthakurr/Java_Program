package oops1;

class DynamicArray {
    int nextIndex;
    private int[] data;

    DynamicArray() {
        data = new int[5];
        int nextIndex = 0;

    }

    public int size() {
        return nextIndex;
    }

    public void add(int element) {
        if (nextIndex != data.length) {
            data[nextIndex] = element;
            ++nextIndex;
        } else
            restructure();

    }

    private void restructure() {
        int[] temp = data;
        data = new int[data.length * 2];

        System.arraycopy(temp, 0, data, 0, temp.length);

    }

    public int get(int index) {
        if (index >= nextIndex)
            return -1;
        return data[index];
    }

    public void set(int index, int value) {
        if (index > nextIndex)
            return;

        else if (index < nextIndex)
            data[index] = value;
        else
            add(value);
    }

    public boolean isEmpty() {
        return nextIndex == 0;
    }

    public int removeLast() {
        if (size() == 0)
            return -1;
        else {
            int value = data[nextIndex - 1];
            data[nextIndex] = 0;
            --nextIndex;
            return value;
        }
    }

}

public class DynamicArrayUse {
    public static void main(String[] args) {

        DynamicArray d = new DynamicArray();

        for (int i = 0; i < 100; ++i) {
            d.add(i + 10);
        }
        System.out.println(d.size());
        System.out.println(d.get(5));
        d.set(2, 0);
        System.out.println(d.get(2));

        while (!d.isEmpty()) {
            System.out.println(d.removeLast());
            System.out.println("size : " + d.size());


        }

    }

}
