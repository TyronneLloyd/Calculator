package org.junit.jupiter.api;

import java.util.concurrent.TimeUnit;

public @interface Timeout {
    TimeUnit unit();

    int value();
}
