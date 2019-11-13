package ru.yurivan.algorithms4th.utils.test.manager;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestDataManager {
    private static final String EXAMPLES_TEST_DATA_FOLDER_PATH = "/testdata/ru/yurivan/algorithms4th/";

    private static class InstanceHolder {
        private static final TestDataManager instance = new TestDataManager();
    }

    public static TestDataManager getInstance() {
        return TestDataManager.InstanceHolder.instance;
    }

    private TestDataManager() {
    }

    /**
     * Build full path to test data file.
     *
     * @param filePathInsideTestDataPackage full path including filename with extension inside test data package.
     * @return full path to specified test data file.
     */
    public Path buildTestDataFilePath(final String filePathInsideTestDataPackage)
            throws URISyntaxException {
        return Paths.get(
                getClass()
                        .getResource(EXAMPLES_TEST_DATA_FOLDER_PATH + File.separator + filePathInsideTestDataPackage)
                        .toURI());
    }
}
