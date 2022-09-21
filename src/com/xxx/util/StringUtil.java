package com.xxx.util;

/**
 * @author 言云月
 * @data 2022/9/20 14:31
 */
public class StringUtil {
    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim())) {
            return true;
        }
        return false;
    }
}
