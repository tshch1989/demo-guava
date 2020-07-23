package com.example.demoguava.demo.base;

import com.google.common.base.Converter;
import com.google.common.base.Enums;
import com.google.common.base.Optional;

public class EnumsDemo {
    public static void main(String[] args) {
        Optional<DemoEnum> optional = Enums.getIfPresent(DemoEnum.class, "A");
        assert optional.isPresent();

        Converter<String, DemoEnum> converter = Enums.stringConverter(DemoEnum.class);
        DemoEnum demoEnum = converter.convert("A");
        assert demoEnum == DemoEnum.A;
    }

    enum DemoEnum{
        A(101, "A"),
        B(102, "B"),
        C(103, "C");

        private final int code;
        private final String desc;

        DemoEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
}
