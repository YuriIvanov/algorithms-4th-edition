package yurivan.algorithms4th.exercises.fundamentals.casestudyunionfind.ex_1_5_8;

/*
    Give a counterexample that shows why this intuitive implementation of union() for quick-ﬁnd is not correct:
        public void union(int p, int q)
        {
           if (connected(p, q)) return;
           // Rename p’s component to q’s name.
           for (int i = 0; i < id.length; i++)
               if (id[i] == id[p]) id[i] = id[q];
           count--;
        }
 */

public class QuickFindUnionCounterExample {

}

