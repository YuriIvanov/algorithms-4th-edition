package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

public class FixedCapacityStack<T>{
    private T[] items;
    private int N;

    @SuppressWarnings("unchecked")
    public FixedCapacityStack(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        items[N++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("You're trying to pop item from an empty stack.");
        }

        return items[--N];
    }
}
