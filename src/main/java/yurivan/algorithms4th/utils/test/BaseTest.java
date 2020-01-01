package yurivan.algorithms4th.utils.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import yurivan.algorithms4th.utils.settings.SettingsManager;
import yurivan.algorithms4th.utils.test.listener.TestLifecycleListener;
import yurivan.algorithms4th.utils.test.manager.TestDataManager;

import java.io.IOException;

/**
 * Base class for any types of tests.
 * It is getting and keeping meta information about test.
 */
@Listeners(TestLifecycleListener.class)
public abstract class BaseTest {
    private final SettingsManager settingsManager = SettingsManager.getInstance();
    private final TestDataManager testDataManager = TestDataManager.getInstance();

    @BeforeClass
    public void setupBaseTest()
            throws IOException {
    }

    @AfterClass
    public void shutdownBaseTest()
            throws IOException {
    }

    protected SettingsManager getSettingsManager() {
        return settingsManager;
    }

    protected TestDataManager getTestDataManager() {
        return testDataManager;
    }
}

