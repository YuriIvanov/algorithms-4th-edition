package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist;

import java.util.Iterator;

public class ListIterator<T> implements Iterator<T> {
    private LinkedListNode<T> current;

    public ListIterator(LinkedListNode<T> current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        T item = current.getItem();
        current = current.getNext();
        return item;
    }

    @Override
    public void remove() {
    }
}
