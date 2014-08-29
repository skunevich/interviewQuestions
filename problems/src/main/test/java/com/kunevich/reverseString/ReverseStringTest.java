package com.kunevich.reverseString;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    private static final String STRING_TO_REVERSE = "The cow jumped over the moon.";
    private static final String REVERSED_STRING = ".noom eht revo depmuj woc ehT";
    private ReverseString reverseString;

    @Before
    public void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    public void testReverseStringStringBuilderSolution(){
        String actual = reverseString.reverseStringStringBuilderSolution(STRING_TO_REVERSE);
        assertEquals(REVERSED_STRING, actual);
    }

    @Test
    public void testReverseStringOldSchool() {
        String actual = reverseString.reverseStringOldSchool(STRING_TO_REVERSE);
        assertEquals(REVERSED_STRING, actual);
    }

    @Test
    public void testReverseStringUsingRecursion() {
        String actual = reverseString.reverseStringUsingRecursion(STRING_TO_REVERSE);
        assertEquals(REVERSED_STRING, actual);
    }

}