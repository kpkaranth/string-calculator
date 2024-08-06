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

    @Test
    void add_addTwoNumbersDelimitedByCommaWithSpace() {
        assertEquals(3, stringCal.add("1 ,2 "));
    }

    @Test
    void add_addTwoNumbersDelimitedByCommaAndNewLine() {
        assertEquals(6, stringCal.add("1\n2,3"));
    }

    @Test
    void add_addTwoNumbersDelimitedByNewLineAndComma() {
        assertEquals(6, stringCal.add("1,2\n3"));
    }

    @Test
    void add_addTwoNumbersDelimitedByNewLineAndComma2() {
        assertEquals(9, stringCal.add("1,2\n3,2,1\n0"));
    }

}
