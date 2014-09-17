package com.kunevich.palindrome;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PalindromeTest {
    private List<PalidromeTestValues> testValuesList = new ArrayList<>();
    private Palindrome palindrome = new Palindrome();

    @Before
    public void setUp() {
        testValuesList.add(new PalidromeTestValues("Eva, can I stab bats in a cave?", true));
        testValuesList.add(new PalidromeTestValues("Mr. Owl ate my metal worm", true));
        testValuesList.add(new PalidromeTestValues("Was it a car or a cat I saw", true));
        testValuesList.add(new PalidromeTestValues("A nut for a jar of tuna", true));
        testValuesList.add(new PalidromeTestValues("Do geese see God?", true));
        testValuesList.add(new PalidromeTestValues("On a clover, if alive erupts a vast pure evil, a fire volcano.", true));
        testValuesList.add(new PalidromeTestValues("Go hang a salami, I'm a lasagna hog", true));
        testValuesList.add(new PalidromeTestValues("Go hang a salami, I'm a lasagna hogg", false));
        testValuesList.add(new PalidromeTestValues("Some random string.", false));
        testValuesList.add(new PalidromeTestValues("notone", false));
    }

    @Test
    public void testValues(){
        for (PalidromeTestValues palidromeTestValues : testValuesList) {
            String message = palidromeTestValues.toString();
            boolean isPalindrome = palindrome.isPalindrome(palidromeTestValues.getTestValue());
            assertEquals(message, palidromeTestValues.isPalidrome(), isPalindrome);
        }
    }
}