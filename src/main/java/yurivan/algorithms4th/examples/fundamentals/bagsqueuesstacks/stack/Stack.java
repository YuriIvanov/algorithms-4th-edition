package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.stack;

import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.LinkedListNode;
import yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist.ListIterator;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private LinkedListNode<T> top; // Top of the stack (most recently added node).
    private int size;

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        // Add item to top of stack.
        LinkedListNode<T> oldTop = top;

        top = new LinkedListNode<>();
        top.setItem(item);
        top.setNext(oldTop);

        ++size;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("You're trying to pop item from an empty stack.");
        }

        // Remove item from top of stack.
        T item = top.getItem();
        top = top.getNext();

        --size;

        return item;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(top);
    }
}
