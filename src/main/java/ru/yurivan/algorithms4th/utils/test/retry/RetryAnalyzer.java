package ru.yurivan.algorithms4th.utils.test.retry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import ru.yurivan.algorithms4th.utils.miscellaneous.Sleeper;
import ru.yurivan.algorithms4th.utils.settings.SettingsManager;

/**
 * Retry test if it has failed.
 */
public class RetryAnalyzer implements IRetryAnalyzer {
    private static final Logger log = LoggerFactory.getLogger(RetryAnalyzer.class);

    private static final int MAX_RETRY_COUNT =
            SettingsManager.getInstance().getCommonSettings().getMaxRetryCount();

    private int retryCount = 0;

    @Override
    public boolean retry(ITestResult testResult) {
        boolean needToRetry = false;

        final String stackTrace = testResult.getThrowable().fillInStackTrace().toString();
        if (!testResult.isSuccess() && !stackTrace.contains("java.lang")) {
            log.info("Attempt number: {}." + "\nMax number of attempts: {}.", retryCount + 1, MAX_RETRY_COUNT);

            if (retryCount < MAX_RETRY_COUNT) {
                log.info(
                        "Retrying {} with status {} for the try {} of {} max times, with stacktrace {}",
                        testResult.getName(),
                        testResult.getStatus(),
                        (retryCount + 1),
                        MAX_RETRY_COUNT,
                        stackTrace);

                retryCount++;
                needToRetry = true;
            }
        }
        Sleeper.sleep(5 * 1000);

        return needToRetry;
    }
}

