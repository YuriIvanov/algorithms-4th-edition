package ru.yurivan.algorithms4th.utils.settings;

import ru.yurivan.algorithms4th.utils.settings.model.CommonSettings;

import java.util.ResourceBundle;

/**
 * Main point in app to get settings.
 */
public class SettingsManager {
    private static final String SETTINGS_COMMON_RESOURCE_BUNDLE_NAME = "common";
    private static final String SETTING_KEY_MAX_RETRY_COUNT = "qa.max.retry.count";

    private final String TEST_DATA_FOLDER_PATH = "/testdata";
    private final String TEST_DATA_FILES_FOLDER_PATH = TEST_DATA_FOLDER_PATH + "/files";
    private final String TEST_DATA_IMAGE_FOLDER_PATH = TEST_DATA_FOLDER_PATH + "/images";
    private final String TEST_DATA_TEST_DATA_SETS_PATH = TEST_DATA_FOLDER_PATH + "/testdatasets";

    private final CommonSettings COMMON_SETTINGS;

    private static class InstanceHolder {
        private static final SettingsManager instance = new SettingsManager();
    }

    public static SettingsManager getInstance() {
        return InstanceHolder.instance;
    }

    private SettingsManager() {
        COMMON_SETTINGS = buildCommonSettings();
    }

    public CommonSettings getCommonSettings() {
        return COMMON_SETTINGS;
    }

    public String getTestDataSetsPath() {
        return TEST_DATA_TEST_DATA_SETS_PATH;
    }

    public String getTestDataFilesFolderPath() {
        return TEST_DATA_FILES_FOLDER_PATH;
    }

    public String getTestDataImageFolderPath() {
        return TEST_DATA_IMAGE_FOLDER_PATH;
    }

    private CommonSettings buildCommonSettings() {
        ResourceBundle commonResourceBundle = ResourceBundle.getBundle(SETTINGS_COMMON_RESOURCE_BUNDLE_NAME);

        final String maxRetryCount =
                System.getProperty(
                        SETTING_KEY_MAX_RETRY_COUNT,
                        commonResourceBundle.getString(SETTING_KEY_MAX_RETRY_COUNT));
        return
                new CommonSettings.Builder()
                        .setMaxRetryCount(Integer.parseInt(maxRetryCount))
                        .build();
    }
}
