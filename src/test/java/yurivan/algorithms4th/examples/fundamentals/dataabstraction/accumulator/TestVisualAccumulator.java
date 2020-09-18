package yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulator;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulators.VisualAccumulator;

public class TestVisualAccumulator {
    public static void main(String[] args) {
        final int times = Integer.parseInt(args[0]);

        VisualAccumulator accumulator = new VisualAccumulator(times, 1.0);
        for (int t = 0; t < times; ++t) {
            accumulator.addDataValue(StdRandom.uniform());
        }

        StdOut.println(accumulator);
    }
}
