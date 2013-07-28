package com.derbysoft.string;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SubStringTest {

    @Test
    public void testOutOfMemory() {
        String largeString = new String(new byte[1000000]);
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            strings.add(largeString.substring(0, 1));
        }
    }

    @Test
    public void test() {
        String largeString = new String(new byte[1000000]);
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10000000; i++) {
            strings.add(new String(largeString.substring(0, 1)));
        }
    }

}
