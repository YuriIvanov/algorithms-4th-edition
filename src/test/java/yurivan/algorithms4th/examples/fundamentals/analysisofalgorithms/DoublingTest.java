package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;

public class DoublingTest {
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
        for (int n = 250; true; n += n) {
            double time = timeTrial(n);
            StdOut.printf("%7d %5.1f\n", n, time);
        }
    }
}
