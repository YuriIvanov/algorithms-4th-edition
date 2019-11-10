package ru.yurivan.algorithms4th.utils.settings.model;

public class CommonSettings {
    private final int maxRetryCount;

    private CommonSettings(Builder builder) {
        this.maxRetryCount = builder.maxRetryCount;
    }

    public int getMaxRetryCount() {
        return maxRetryCount;
    }

    public static class Builder {
        private int maxRetryCount;

        public CommonSettings build() {
            return new CommonSettings(this);
        }

        public Builder setMaxRetryCount(int maxRetryCount) {
            this.maxRetryCount = maxRetryCount;
            return this;
        }
    }
}
