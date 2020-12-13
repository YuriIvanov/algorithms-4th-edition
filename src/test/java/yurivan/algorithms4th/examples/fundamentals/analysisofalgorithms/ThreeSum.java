package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdOut;

public class ThreeSum {
    public static int count(int[] a) {
        int length = a.length;

        int count = 0;
        for (int i = 0; i < length; ++i) {
            for (int j = i + 1; j < length; ++j) {
                for (int k = j + 1; k < length; ++k) {
                    if (a[i] + a[j] + a[k] == 0) {
                        ++count;
                    }
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
