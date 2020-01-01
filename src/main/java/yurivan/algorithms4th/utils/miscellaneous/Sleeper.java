package yurivan.algorithms4th.utils.miscellaneous;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Waiting utilities.
 */
public final class Sleeper {
    private static final Logger log = LoggerFactory.getLogger(Sleeper.class);

    private Sleeper() {
        throw new UnsupportedOperationException("You try to create instance of utility class.");
    }

    public static void sleep(final long durationInMillis) {
        try {
            Thread.sleep(durationInMillis);
        } catch (InterruptedException e) {
            log.error("Thread was interrupted.", e);
            Thread.currentThread().interrupt();
        }
    }
}
