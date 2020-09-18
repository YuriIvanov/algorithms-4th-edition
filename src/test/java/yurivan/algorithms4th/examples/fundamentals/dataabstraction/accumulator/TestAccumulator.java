package yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulator;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;
import yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulators.Accumulator;

public class TestAccumulator {
    public static void main(String[] args) {
        final int times = Integer.parseInt(args[0]);

        Accumulator accumulator = new Accumulator();
        for (int t = 0; t < times; ++t) {
            accumulator.addDataValue(StdRandom.random());
        }

        StdOut.println(accumulator);
    }
}
