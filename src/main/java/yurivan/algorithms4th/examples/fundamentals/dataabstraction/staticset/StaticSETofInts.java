package yurivan.algorithms4th.examples.fundamentals.dataabstraction.staticset;

import yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch.BinarySearch;

import java.util.Arrays;

public class StaticSETofInts {
    private final int[] values;

    public StaticSETofInts(int[] values) {
        this.values = Arrays.copyOf(values, values.length);
        Arrays.sort(this.values);
    }

    public boolean contains(int key) {
        return rank(key) != -1;
    }

    private int rank(int key) {
        return BinarySearch.rank(key, values,BinarySearch.BinarySearchArraySortDirection.ASCENDING);
    }
}
