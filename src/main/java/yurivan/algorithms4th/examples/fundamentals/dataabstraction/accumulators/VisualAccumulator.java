package yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulators;

import edu.princeton.cs.introcs.StdDraw;

public class VisualAccumulator {
    private double total;
    private int quantity;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double value) {
        ++quantity;
        total += value;

        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(quantity, value);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(quantity, mean());
    }

    public double mean() {
        return total / quantity;
    }

    @Override
    public String toString() {
        return String.format("Mean (%d) values: %7.5f", quantity, mean());
    }
}
