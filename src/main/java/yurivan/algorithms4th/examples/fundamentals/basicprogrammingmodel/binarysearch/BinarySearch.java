package yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch;

public final class BinarySearch {
    private BinarySearch() {
        throw new RuntimeException("You can't instantiate this class.");
    }

    /**
     * Find a key inside provided array.
     * @param key key to find.
     * @param a array to find key in. It should be sorted.
     * @return key index if key is present in provided array of -1 otherwise.
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
