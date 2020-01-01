package yurivan.algorithms4th.utils.test.model;

public class TestDataSettings {
    private final String testDataFolder;

    private TestDataSettings(Builder builder) {
        this.testDataFolder = builder.testDataFolder;
    }

    public String getTestDataFolder() {
        return testDataFolder;
    }

    public static class Builder {
        private String testDataFolder;

        public TestDataSettings build() {
            return new TestDataSettings(this);
        }

        public Builder setTestDataFolder(String testDataFolder) {
            this.testDataFolder = testDataFolder;
            return this;
        }
    }
}
