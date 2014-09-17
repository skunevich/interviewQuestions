package com.kunevich.palindrome;

/**
 * @author Sean Kunevich <sean@kunevich.com>
 */
public class PalidromeTestValues {
    private String testValue;
    private boolean isPalidrome;

    public PalidromeTestValues(String testValue, boolean isPalidrome) {
        this.testValue = testValue;
        this.isPalidrome = isPalidrome;
    }

    public String getTestValue() {
        return testValue;
    }

    public boolean isPalidrome() {
        return isPalidrome;
    }

    @Override
    public String toString() {
        return System.getProperty("line.separator") + "testValue: " + testValue + System.getProperty("line.separator") + "isPalidrome: " + isPalidrome;
    }
}
