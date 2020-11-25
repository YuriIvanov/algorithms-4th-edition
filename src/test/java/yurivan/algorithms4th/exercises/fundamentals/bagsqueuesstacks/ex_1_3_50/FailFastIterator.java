package yurivan.algorithms4th.exercises.fundamentals.bagsqueuesstacks.ex_1_3_50;

/*
    Modify  the  iterator  code  in  Stack to immediately throw a java.util.ConcurrentModificationException
    if the client modifies the collection (via push() or pop()) during iteration.

    Solution: Maintain a counter that counts the number of push() and pop() operations.
    When creating an iterator, store this value as an Iterator instance variable.
    Before each call to hasNext() and next(), check that this value has not changed since construction of the iterator;
    if it has, throw the exception.
 */

public class FailFastIterator {

}
