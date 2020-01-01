package yurivan.algorithms4th.utils.test.manager;

import yurivan.algorithms4th.utils.test.model.TestDataSettings;

import java.io.File;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

public class TestDataManager {
    private static final String SETTINGS_TEST_DATA_RESOURCE_BUNDLE_NAME = "testData";
    private static final String SETTING_KEY_TEST_DATA_FOLDER = "test.data.folder";

    private final TestDataSettings TEST_DATA_SETTINGS;

    private static class InstanceHolder {
        private static final TestDataManager instance = new TestDataManager();
    }

    public static TestDataManager getInstance() {
        return TestDataManager.InstanceHolder.instance;
    }

    private TestDataManager() {
        TEST_DATA_SETTINGS = buildTestDataSettings();
    }

    private TestDataSettings buildTestDataSettings() {
        ResourceBundle testDataResourceBundle = ResourceBundle.getBundle(SETTINGS_TEST_DATA_RESOURCE_BUNDLE_NAME);

        final String testDataFolder =
                System.getProperty(
                        SETTING_KEY_TEST_DATA_FOLDER,
                        testDataResourceBundle.getString(SETTING_KEY_TEST_DATA_FOLDER));
        return
                new TestDataSettings.Builder()
                        .setTestDataFolder(testDataFolder)
                        .build();
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
                        .getResource(
                                TEST_DATA_SETTINGS.getTestDataFolder() +
                                        File.separator +
                                        filePathInsideTestDataPackage)
                        .toURI());
    }
}
