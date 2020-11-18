package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.linkedlist;

public class LinkedListNode<T> {
    private T item;
    private LinkedListNode<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public LinkedListNode<T> getNext() {
        return next;
    }

    public void setNext(LinkedListNode<T> next) {
        this.next = next;
    }
}
