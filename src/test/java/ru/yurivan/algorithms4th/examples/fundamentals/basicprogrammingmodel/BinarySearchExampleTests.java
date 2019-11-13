package ru.yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.StopwatchCPU;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel.binarysearch.BinarySearch;
import ru.yurivan.algorithms4th.utils.test.BaseTest;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Arrays;

public class BinarySearchExampleTests extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BinarySearchExampleTests.class);

    private static final String TINY_WHITELIST_TEST_DATA_FILE_PATH = "tinyW.txt";
    private static final String TINY_VALUES_TEST_DATA_FILE_PATH = "tinyT.txt";

    private static final String LARGE_WHITELIST_TEST_DATA_FILE_PATH = "largeW.txt";
    private static final String LARGE_VALUES_TEST_DATA_FILE_PATH = "largeW.txt";

    private Path tinyWhitelistFile;
    private Path tinyValuesFile;
    private Path largeWhitelistFile;
    private Path largeValuesFile;

    @BeforeClass(dependsOnMethods = "setupBaseTest")
    public void setUp()
            throws IOException, URISyntaxException {
        tinyWhitelistFile = getTestDataManager().buildTestDataFilePath(TINY_WHITELIST_TEST_DATA_FILE_PATH);
        tinyValuesFile = getTestDataManager().buildTestDataFilePath(TINY_VALUES_TEST_DATA_FILE_PATH);

        largeWhitelistFile = getTestDataManager().buildTestDataFilePath(LARGE_WHITELIST_TEST_DATA_FILE_PATH);
        largeValuesFile = getTestDataManager().buildTestDataFilePath(LARGE_VALUES_TEST_DATA_FILE_PATH);
    }

    @AfterClass(dependsOnMethods = "shutdownBaseTest")
    public void tearDown()
            throws IOException {
    }

    @Test(description = "Check that binary search implementation works as expected.")
    public void binarySearchCorrectness()
            throws IOException {
        In whitelistFile = new In(tinyWhitelistFile.toFile());
        In valuesFile = new In(tinyValuesFile.toFile());

        final int[] whitelist = whitelistFile.readAllInts();
        Arrays.sort(whitelist);

        log.info("Values that are not in whitelist:");
        while (!valuesFile.isEmpty()) {
            final int key = valuesFile.readInt();
            if (BinarySearch.rank(key, whitelist) < 0) {
                log.info("{}", key);
            }
        }
    }

    @Test(description = "Check that binary search implementation works as expected.")
    public void binarySearchPerformanceEstimation()
            throws IOException {
        In whitelistFile = new In(largeWhitelistFile.toFile());
        In valuesFile = new In(largeValuesFile.toFile());

        final int[] whitelist = whitelistFile.readAllInts();
        Arrays.sort(whitelist);

        final int[] values = valuesFile.readAllInts();

        // Start estimation.
        final StopwatchCPU stopwatchCpu = new StopwatchCPU();
        for (int key : values) {
            BinarySearch.rank(key, whitelist);
        }
        log.info(
                "Performance of this binary search implementation.\n" +
                        "Whitelist size: {}\n" +
                        "Number of values to check against: {}\n" +
                        "Elapsed CPU time: {}\n",
                whitelist.length,
                values.length,
                stopwatchCpu.elapsedTime());
    }
}
