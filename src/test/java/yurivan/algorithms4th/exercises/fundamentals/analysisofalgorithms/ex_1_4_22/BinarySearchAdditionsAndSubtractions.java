package yurivan.algorithms4th.exercises.fundamentals.analysisofalgorithms.ex_1_4_22;

/*
    [Mihai Patrascu] Write a program that, given an array of N distinct int values in ascending order, determines
    whether a given integer is in the array. You may use only additions and subtractions and a constant amount
    of extra memory. The running time of your program should be proportional to log N in the worst case.

    Answer: Instead of searching based on powers of two (binary search), use Fibonacci
    numbers (which also grow exponentially). Maintain the current search range to be the interval [i, i + F k]
    and keep F k and F k–1 in two variables. At each step compute Fk–2 via subtraction,
    check element i + Fk–2 , and update the current range to either [i, i + Fk–2] or [i + Fk–2, i + Fk–2 + Fk–1].
 */

public class BinarySearchAdditionsAndSubtractions {

}
