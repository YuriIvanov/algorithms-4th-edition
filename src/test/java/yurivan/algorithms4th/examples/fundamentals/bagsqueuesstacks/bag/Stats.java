package yurivan.algorithms4th.examples.fundamentals.bagsqueuesstacks.bag;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers = new Bag<>();

        while (!StdIn.isEmpty()) {
            numbers.add(StdIn.readDouble());
        }

        final int numberOfNumbers = numbers.size();
        double sum = 0.0;
        for (double d : numbers) {
            sum += d;
        }
        final double mean = sum / numberOfNumbers;

        sum = 0.0;
        for (double d : numbers) {
            sum += (d - mean) * (d - mean);
        }
        final double std = Math.sqrt(sum / (numberOfNumbers - 1));

        StdOut.printf(
                "Mean: %.2f\n" +
                "Std dev: %.2f\n",
                mean, std);
    }
}
