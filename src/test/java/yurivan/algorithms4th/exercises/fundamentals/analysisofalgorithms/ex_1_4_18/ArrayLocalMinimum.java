package yurivan.algorithms4th.exercises.fundamentals.analysisofalgorithms.ex_1_4_18;

/*
    Write a program that, given an array a[] of N distinct integers, finds a local minimum:
    an index i such that a[i - 1] < a[i] < a[i + 1].
    Your program should use ~2lg N compares in the worst case.

    Answer: Examine the middle value a[N / 2] and its two neighbors a[N / 2 - 1] and a[N/2 + 1].
    If a[N / 2] is a local minimum, stop; otherwise search in the half with the smaller neighbor.
 */

public class ArrayLocalMinimum {

}
