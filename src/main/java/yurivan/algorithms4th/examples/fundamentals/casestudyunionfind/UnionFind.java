package yurivan.algorithms4th.examples.fundamentals.casestudyunionfind;

public abstract class UnionFind {
    /**
     * Storage for site nodes. Underlying data structure depends on implementation.
     */
    protected int[] id;

    /**
     * Number of components.
     */
    protected int count;

    /**
     * Initialize size number of sites with integer names (0 to size - 1).
     * @param size number of sites.
     */
    public UnionFind(int size) {
        count = size;
        id = new int[size];

        for(int i = 0; i < size; ++i) {
            id[i] = i;
        }
    }

    /**
     * Return number of components.
     * @return number of components.
     */
    public int count() {
        return count;
    }

    /**
     * Return true if p and q are in the same component.
     * @param p first site to check against.
     * @param q second site to check against.
     * @return return true if p and q are in the same component.
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    /**
     * Component identifier for p (0 to size - 1).
     * @param p site which identifier to find.
     * @return identifier of provided site.
     */
    public abstract int find(int p);

    /**
     * Add connection between p and q if they are not connected yet.
     * @param p first site.
     * @param q second site.
     */
    public abstract void union(int p, int q);
}
