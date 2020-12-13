package yurivan.algorithms4th.examples.fundamentals.analysisofalgorithms;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import edu.princeton.cs.introcs.Stopwatch;

public class StopwatchClient {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        int[] a = new int[size];

        for (int i = 0; i < size; ++i) {
            a[i] = StdRandom.uniform(-1_000_000, 1_000_000);
        }

        Stopwatch timer = new Stopwatch();
        int count = ThreeSum.count(a);
        double time = timer.elapsedTime();

        StdOut.println(count + " triples " + time);
    }
}
