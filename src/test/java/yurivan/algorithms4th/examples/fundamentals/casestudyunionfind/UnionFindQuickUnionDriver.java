package yurivan.algorithms4th.examples.fundamentals.casestudyunionfind;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class UnionFindQuickUnionDriver {
    public static void main(String[] args) {
        // Solve dynamic connectivity problem on StdIn.

        final int size = StdIn.readInt(); // Read number of sites.
        UnionFind unionFind = new UnionFindQuickUnion(size); // Initialize size number of components.

        while (!StdIn.isEmpty()) {
            // Read pair to connect.
            final int p = StdIn.readInt();
            final int q = StdIn.readInt();

            // Ignore if already connected.
            if (unionFind.connected(p, q)) {
                continue;
            }

            // Combine component and print connection.
            unionFind.union(p, q);

            StdOut.println(p + " " + q);
        }

        StdOut.println(unionFind.count() + " components.");
    }
}
