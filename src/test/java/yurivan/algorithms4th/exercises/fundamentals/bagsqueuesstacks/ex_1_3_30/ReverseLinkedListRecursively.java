package yurivan.algorithms4th.exercises.fundamentals.bagsqueuesstacks.ex_1_3_30;

/*
    Write a function that takes the first Node in a linked list as argument and (destructively)
    reverses the list, returning the first Node in the result.

    Recursive solution:  Assuming the linked list has N nodes, we recursively reverse the last N – 1 nodes,
    and then carefully append the first node to the end.

    public Node reverse(Node first)
    {
       if (first == null) return null;
       if (first.next == null) return first;
       Node second = first.next;
       Node rest = reverse(second);
       second.next = first;
       first.next  = null;
       return rest;
    }
 */

public class ReverseLinkedListRecursively {

}
