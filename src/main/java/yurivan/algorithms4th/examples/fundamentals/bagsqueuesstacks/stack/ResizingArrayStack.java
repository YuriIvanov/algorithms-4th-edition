package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import java.util.Iterator;

public class ResizingArrayStack<T> implements Iterable<T> {
    @SuppressWarnings("unchecked")
    private T[] items = (T[]) new Object[1];
    
    private int N;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return N;
    }

    public void push(T item) {
        if (N == items.length) {
            resize(2 * items.length);
        }

        items[N++] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("You're trying to pop item from an empty stack.");
        }

        T item = items[--N];
        items[N] = null;

        if (N > 0 && N == items.length / 4) {
            resize(items.length / 2);
        }

        return item;
    }

    @SuppressWarnings("unchecked")
    private void resize(int max) {
        T[] temp = (T[]) new Object[max];
        if (N >= 0) {
            System.arraycopy(items, 0, temp, 0, N);
        }
        items = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<T> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return items[--i];
        }

        @Override
        public void remove() {
        }
    }
}
