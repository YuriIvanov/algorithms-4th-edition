package yurivan.algorithms4th.examples.fundamentals.casestudyunionfind;

import java.util.Arrays;

public final class UnionFindWeightedQuickUnion extends UnionFind {
    /**
     * Size of component for roots (site indexed).
     */
    private int[] componentSizes;

    /**
     * Initialize size number of sites with integer names (0 to size - 1).
     *
     * @param size number of sites.
     */
    public UnionFindWeightedQuickUnion(int size) {
        super(size);

        componentSizes = new int[size];
        Arrays.fill(componentSizes, 1);
    }

    @Override
    public int find(int p) {
        // Follow links to find a root.
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }

    @Override
    public void union(int p, int q) {
        // Give p and q the same root.
        final int pRoot = find(p);
        final int qRoot = find(q);

        if (pRoot == qRoot) {
            return;
        }

        // Make smaller root point to larger one.
        if (componentSizes[pRoot] < componentSizes[qRoot]) {
            id[pRoot] = qRoot;
            componentSizes[qRoot] += componentSizes[pRoot];
        } else {
            id[qRoot] = pRoot;
            componentSizes[pRoot] += componentSizes[qRoot];
        }

        --count;
    }
}
