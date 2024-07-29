package com.fastcamp.tddstarter.ch02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertEqualsTest {
    @Test
    void assertEqualsExample1Test(){
        int actual = 1;
        int expected = 1;
        assertEquals(expected, actual);
    }
}
