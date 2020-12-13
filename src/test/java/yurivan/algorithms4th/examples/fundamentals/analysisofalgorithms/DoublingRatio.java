package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;

public class DoublingRatio {
    public static double timeTrial(int size) {
        final int MAX = 1_000_000;
        int[] a = new int[size];

        for (int i = 0; i < size; ++i) {
            a[i] = StdRandom.uniform(-MAX, MAX);
        }

        Stopwatch timer = new Stopwatch();

        ThreeSum.count(a);

        return timer.elapsedTime();
    }

    public static void main(String[] args) {
        double prev = timeTrial(125);
        for (int size = 250; true; size += size) {
            double time = timeTrial(size);

            StdOut.printf("%6d %7.1f ", size, time);
            StdOut.printf("%5.1f\n", time / prev);

            prev = time;
        }
    }
}
