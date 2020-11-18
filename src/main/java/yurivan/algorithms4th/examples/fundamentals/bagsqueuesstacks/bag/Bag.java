package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.bag;

import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.LinkedListNode;
import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.ListIterator;

import java.util.Iterator;

public class Bag<T> implements Iterable<T> {
    private LinkedListNode<T> first; // First node in list.
    private int size;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void add(T item) {
        LinkedListNode<T> oldFirst = first;
        first = new LinkedListNode<>();
        first.setItem(item);
        first.setNext(oldFirst);

        ++size;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(first);
    }
}
