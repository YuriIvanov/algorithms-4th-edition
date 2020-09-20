package yurivan.algorithms4th.exercises.fundamentals.dataabstraction.ex_1_2_18;

/*
    Validate that the following code, which adds the methods var() and stddev() to Accumulator,
    computes both the mean and variance of the numbers presented as arguments to addDataValue():

    public class Accumulator
    {
       private double m;
       private double s;
       private int N;

       public void addDataValue(double x)
       {
            N++;
            s = s + 1.0 * (N-1) / N * (x - m) * (x - m);
            m = m + (x - m) / N;
       }

       public double mean()
       {
            return m;
       }

       public double var()
       {
            return s/(N - 1);
       }

       public double stddev()
       {
            return Math.sqrt(this.var());
       }
    }

    This implementation is less susceptible to roundoff error than the straightforward implementation
    based on saving the sum of the squares of the numbers.
 */

public class VarianceForAccumulator {

}

