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

    @Test
    public void add_validNumber() {
        assertEquals(12, stringCal.add("12"));
    }

    @Test
    public void add_invalidNumber() {
        assertEquals(0, stringCal.add("12a"));
    }

    @Test
    void add_addTwoNumbersDelimitedByComma() {
        assertEquals(3, stringCal.add("1,2"));
    }

}
