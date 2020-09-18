package yurivan.algorithms4th.examples.fundamentals.dataabstraction.counter;

import edu.princeton.cs.introcs.StdOut;
import edu.princeton.cs.introcs.StdRandom;

public class Rolls {
    public static void main(String[] args) {
        final int times = Integer.parseInt(args[0]);
        final int sides = 6;

        Counter[] rolls = new Counter[sides + 1];
        for (int i = 1; i <= sides; ++i) {
            rolls[i] = new Counter(i + "'s");
        }

        for (int t = 0; t < times; ++t) {
            int result = StdRandom.uniform(1, sides + 1);
            rolls[result].increment();
        }

        for (int i = 1; i <= sides; ++i) {
            StdOut.println(rolls[i]);
        }
    }
}
