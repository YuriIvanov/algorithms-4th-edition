package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;
import yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch.BinarySearch;

import java.util.Arrays;

public class ThreeSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int size = a.length;

        int count = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (BinarySearch.rank(
                        -a[i] -a[j],
                        a,
                        BinarySearch.BinarySearchArraySortDirection.ASCENDING)  > j) {
                    ++count;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = new In(args[0]).readAllInts();

        StdOut.println(count(a));
    }
}
