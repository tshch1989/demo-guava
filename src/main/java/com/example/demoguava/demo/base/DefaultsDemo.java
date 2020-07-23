package com.example.demoguava.demo.base;

import com.google.common.base.Defaults;

public class DefaultsDemo {
    public static void main(String[] args) {
        Boolean aBoolean = Defaults.defaultValue(boolean.class);
        assert false == aBoolean;

        Integer integer = Defaults.defaultValue(int.class);
        assert 0 == integer;

        //....
    }
}
