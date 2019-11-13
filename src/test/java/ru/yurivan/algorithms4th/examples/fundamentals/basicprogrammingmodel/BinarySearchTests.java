package ru.yurivan.algorithms4th.examples.fundamentals.basicprogrammingmodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yurivan.algorithms4th.utils.test.BaseTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class BinarySearchTests extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BinarySearchTests.class);

    private static final String BINARY_SEARCH_EXAMPLE_TEST_DATA_FOLDER_PATH =
            "fundamentals/basicprogrammingmodel/binarysearch"
    private static final String TINY_WHITELIST_EXAMPLE_TEST_DATA_FILE =
            BINARY_SEARCH_EXAMPLE_TEST_DATA_FOLDER_PATH + File.separator + "";
    private static final String

    private final Path tinyWhitelist = getTestDataManager().buildExamplesTestDataFilePath()

    @BeforeClass(dependsOnMethods = "setupBaseTest")
    public void setUp()
            throws IOException {

    }

    @AfterClass(dependsOnMethods = "shutdownBaseTest")
    public void tearDown()
            throws IOException {
    }

    @Test(description = "Check that binary search implementation works as expected.")
    public void binarySearchCorrectness()
            throws IOException {

    }
}
