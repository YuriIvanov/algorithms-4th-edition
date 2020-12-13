package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
import yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch.BinarySearch;

import java.util.Arrays;

public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int size = a.length;

        int count = 0;
        for (int i = 0; i < size; ++i) {
            if (BinarySearch.rank(-a[i], a, BinarySearch.BinarySearchArraySortDirection.ASCENDING) > i) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = new In(args[0]).readAllInts();

        StdOut.println(count(a));
    }
}
