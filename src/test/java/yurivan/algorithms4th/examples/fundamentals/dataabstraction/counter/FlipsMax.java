package yurivan.algorithms4th.examples.fundamentals.dataabstraction.counter;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class FlipsMax {
    private static Counter max(Counter x, Counter y) {
        if (x.tally() > y.tally()) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        final int times = Integer.parseInt(args[0]);

        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        for (int t = 0; t < times; ++t) {
            if (StdRandom.bernoulli(0.5)) {
                heads.increment();
            } else {
                tails.increment();
            }
        }

        if (heads.tally() == tails.tally()) {
            StdOut.println("Tie.");
        } else {
            StdOut.println(max(heads, tails) + " wins.");
        }
    }
}
