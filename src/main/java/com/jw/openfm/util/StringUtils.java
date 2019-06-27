package com.jw.openfm.util;

public class StringUtils {

    public static String trimToEmpty(String value) {
        if (value == null) {
            return "";
        }
        return value.trim();
    }

    public static String trimToNull(String value) {
        if (value == null || value.trim().length() == 0) {
            return null;
        }
        return value.trim();
    }

}
