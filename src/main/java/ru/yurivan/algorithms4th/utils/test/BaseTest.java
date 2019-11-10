package ru.yurivan.algorithms4th.utils.test;

import org.testng.annotations.Listeners;
import ru.yurivan.algorithms4th.utils.test.listener.TestLifecycleListener;

/**
 * Base class for any types of tests.
 * It is getting and keeping meta information about test.
 */
@Listeners(TestLifecycleListener.class)
public abstract class BaseTest {
}

