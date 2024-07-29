package com.fastcamp.tddstarter.ch02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AssertEqualsTest {
    @Test
    void assertEqualsExample1Test(){
        int actual = 1;
        int expected = 1;
        assertEquals(expected, actual);
    }

    private String toUpperCase(String name) throws NullPointerException {
        if(name == null) throw new NullPointerException();
        return name.toUpperCase();
    }
    @Test
    void toUpperCaseTest() {
        try {
            String name = toUpperCase(null);
            Assertions.fail();
            assertEquals("JIHO", name);
        } catch (NullPointerException e) {

        }
    }
}