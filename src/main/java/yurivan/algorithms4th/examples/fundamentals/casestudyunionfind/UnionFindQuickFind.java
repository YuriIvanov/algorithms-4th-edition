package yurivan.algorithms4th.examples.fundamentals.casestudyunionfind;

public final class UnionFindQuickFind extends UnionFind {
    /**
     * Initialize size number of sites with integer names (0 to size - 1).
     *
     * @param size number of sites.
     */
    public UnionFindQuickFind(int size) {
        super(size);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        // Put p and q into the same component.
        final int pId = find(p);
        final int qId = find(q);

        // Nothing to do if p and q are already in the same component.
        if (pId == qId) {
            return;
        }

        // Rename p's component to q's name;
        for (int i = 0; i < id.length; ++i) {
            if (id[i] == pId) {
                id[i] = qId;
            }
            --count;
        }
    }
}
