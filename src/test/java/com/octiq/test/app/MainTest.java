package com.octiq.test.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void capitalizes() {
        assertEquals("Octiq", StringUtils.capitalize("octiq"));
    }
}
