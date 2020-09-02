package yurivan.algorithms4th.exercises.fundamentals.basicprogrammingmodel.ex_1_1_27;

/*
    Estimate the number of recursive calls that would be used by the code
        public static double binomial(int N, int k, double p)
        {
           if ((N == 0) || (k < 0)) return 1.0;
           return (1.0 - p)*binomial(N-1, k) + p*binomial(N-1, k-1);
        }
    to compute binomial(100,  50).
    Develop a better implementation that is based on saving computed values in an array.
 */

public class BinomialDistribution {

}
