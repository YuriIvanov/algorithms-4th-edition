package yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch;

public final class BinarySearch {
    public enum BinarySearchArraySortDirection {
        ASCENDING,
        DESCENDING;
    }

    private BinarySearch() {
        throw new RuntimeException("You can't instantiate this class.");
    }

    /**
     * Find a key inside provided sorted array.
     *
     * @param key                key to find.
     * @param a                  array to find key in.
     * @param arraySortedInOrder in what order array under search has been sorted.
     * @return key index if key is present in provided array of -1 otherwise.
     */
    public static int rank(int key, int[] a, BinarySearchArraySortDirection arraySortedInOrder) {
        if (arraySortedInOrder
                .equals(BinarySearchArraySortDirection.ASCENDING)) {
            return rankAscending(key, a);
        } else {
            return rankDescending(key, a);
        }
    }

    private static int rankAscending(int key, int[] a) {
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

    private static int rankDescending(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key > a[mid]) {
                hi = mid - 1;
            } else if (key < a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
