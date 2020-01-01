package yurivan.algorithms4th.utils.settings;

import yurivan.algorithms4th.utils.settings.model.CommonSettings;

import java.util.ResourceBundle;

/**
 * Main point in app to get settings.
 */
public class SettingsManager {
    private static final String SETTINGS_COMMON_RESOURCE_BUNDLE_NAME = "common";
    private static final String SETTING_KEY_MAX_RETRY_COUNT = "max.retry.count";

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
