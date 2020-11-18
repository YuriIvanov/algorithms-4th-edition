package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.queue;

import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.LinkedListNode;
import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.ListIterator;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private LinkedListNode<T> first; // Link to least recently added node.
    private LinkedListNode<T> last; // Link to most recently added node.
    private int size;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        // Add item to the end of the list.
        LinkedListNode<T> oldLast = last;
        last = new LinkedListNode<>();
        last.setItem(item);
        last.setNext(null);

        if (isEmpty()) {
            first = last;
        } else {
            oldLast.setNext(last);
        }

        ++size;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("You're trying to dequeue item from an empty queue.");
        }

        // Remove item from the beginning of the list.
        T item = first.getItem();

        first = first.getNext();
        --size;

        if (isEmpty()) {
            last = null;
        }

        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(first);
    }
}
