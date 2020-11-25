package yurivan.algorithms4th.exercises.fundamentals.bagsqueuesstacks.ex_1_3_45;

/*
    Suppose that we have a sequence of intermixed push and pop operations as with our test stack client,
    where the integers 0, 1, ..., N-1 in that order (push directives) are intermixed with N minus signs (pop directives).
    Devise an algorithm that determines whether the intermixed sequence causes the stack to underflow.
    (You may use only an amount of space independent of N—you cannot store the integers in a data structure.)
    Devise a linear-time algorithm that determines whether a given permutation can be generated as output
    by our test client (depending on where he pop directives occur).

    Solution: The stack does not overflow unless there exists an integer k such that the first k pop operations
    occur before the first k push operations. If a given permutation can be generated, it is uniquely generated as follows:
    if the next integer in the output permutation is in the top of the stack, pop it; otherwise, push it onto the stack.
 */

public class StackGenerability {

}
