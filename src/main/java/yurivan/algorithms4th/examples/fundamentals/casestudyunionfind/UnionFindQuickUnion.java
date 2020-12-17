package yurivan.algorithms4th.examples.fundamentals.casestudyunionfind;

public final class UnionFindQuickUnion extends UnionFind {
    /**
     * Initialize size number of sites with integer names (0 to size - 1).
     *
     * @param size number of sites.
     */
    public UnionFindQuickUnion(int size) {
        super(size);
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

        id[pRoot] = qRoot;

        --count;
    }
}
