package yurivan.algorithms4th.examples.fundamentals.dataabstraction.accumulators;

public class Accumulator {
    private double total;
    private int quantity;

    public void addDataValue(double value) {
        ++quantity;
        total += value;
    }

    public double mean() {
        return total / quantity;
    }

    @Override
    public String toString() {
        return String.format("Mean (%d) values: %7.5f", quantity, mean());
    }
}
