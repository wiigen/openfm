package com.jw.openfm.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class StringUtilsTest {

    @Test
    public void trimToEmptyShouldReturnCorrectValues() {
        assertEquals("", StringUtils.trimToEmpty(null));
        assertEquals("", StringUtils.trimToEmpty(""));
        assertEquals("", StringUtils.trimToEmpty("  "));
        assertEquals("abc", StringUtils.trimToEmpty("abc "));
        assertEquals("abc", StringUtils.trimToEmpty(" abc"));
    }

    @Test
    public void trimToNullShouldReturnCorrectValues() {
        assertNull(StringUtils.trimToNull(null));
        assertNull(StringUtils.trimToNull(""));
        assertNull(StringUtils.trimToNull("  "));
        assertEquals("abc", StringUtils.trimToNull("abc "));
        assertEquals("abc", StringUtils.trimToNull(" abc"));
    }

}
