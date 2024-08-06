package com.incubyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCalTest {

    StringCal stringCal = new StringCal();

    @Test
    public void add_emptyString() {
        assertEquals(0, stringCal.add(""));
    }

    @Test
    public void add_nullString() {
        assertEquals(0, stringCal.add(null));
    }

}
