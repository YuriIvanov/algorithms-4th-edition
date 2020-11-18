package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

public class FixedCapacityStackOfStrings {
    private String[] items;
    private int N;

    public FixedCapacityStackOfStrings(int capacity) {
        items = new String[capacity];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return N;
    }

    public void push(String item) {
        if (N == items.length) {
            resize(2 * items.length);
        }

        items[N++] = item;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("You're trying to pop item from an empty stack.");
        }

        String item = items[--N];
        items[N] = null;

        if (N > 0 && N == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    private void resize(int max) {
        String[] temp = new String[max];
        if (N >= 0) {
            System.arraycopy(items, 0, temp, 0, N);
        }
        items = temp;
    }
}
