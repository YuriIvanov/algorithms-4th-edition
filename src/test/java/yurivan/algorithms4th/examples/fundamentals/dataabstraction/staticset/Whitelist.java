package yurivan.algorithms4th.examples.fundamentals.dataabstraction.staticset;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;
import yurivan.algorithms4th.utils.test.manager.TestDataManager;

import java.net.URISyntaxException;
import java.nio.file.Path;

public class Whitelist {
    private static final String LARGE_WHITELIST_TEST_DATA_FILE_PATH = "largeW.txt";

    public static void main(String[] args)
            throws URISyntaxException {
        final Path largeWhitelistFile =
                TestDataManager.getInstance().buildTestDataFilePath(LARGE_WHITELIST_TEST_DATA_FILE_PATH);
        final int[] whitelist = new In(largeWhitelistFile.toFile()).readAllInts();

        StaticSETofInts set = new StaticSETofInts(whitelist);
        StdOut.print("Provide key to test against: ");
        while (!StdIn.isEmpty()) {
            final int key = StdIn.readInt();
            if (set.contains(key)) {
                StdOut.println("Provided key is in whitelist.");
            } else {
                StdOut.println("Provided key is not in whitelist.");
            }
            StdOut.print("Provide key to test against: ");
        }
    }
}
