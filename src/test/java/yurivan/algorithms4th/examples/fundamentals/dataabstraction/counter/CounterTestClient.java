package yurivan.algorithms4th.examples.fundamentals.dataabstraction.counter;

import edu.princeton.cs.introcs.StdOut;

public class CounterTestClient {
    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();

        StdOut.println(heads + " " + tails);
        StdOut.println(heads.tally() + tails.tally());
    }
}
