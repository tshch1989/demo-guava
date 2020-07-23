package com.example.demoguava.demo.base;

import com.google.common.base.Strings;

public class StringsDemo {
    public static void main(String[] args) {
        String s = Strings.emptyToNull("");
        assert  s == null;

        boolean nullOrEmpty = Strings.isNullOrEmpty("");
        assert nullOrEmpty;

        boolean nullOrEmpty1 = Strings.isNullOrEmpty(null);
        assert nullOrEmpty1;

        String s1 = Strings.nullToEmpty(null);
        assert s1 == "";

        String s2 = Strings.padStart("123", 10, '0');
        assert "0000000123".equals(s2);

        String s3 = Strings.padEnd("123", 5, '0');
        assert "12300".equals(s3);

        String repeat = Strings.repeat("123", 2);
        assert "123123".equals(repeat);

        String s4 = Strings.commonPrefix("123456789", "123456123456");
        assert "123456".equals(s4);

        String s5 = Strings.commonSuffix("123456", "12312356");
        assert "56".equals(s5);
    }
}
