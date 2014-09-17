package com.kunevich.palindrome;

/**
 * @author Sean Kunevich <sean@kunevich.com>
 */
public class Palindrome {
    public boolean isPalindrome(String input){
        String toReverse = input.replaceAll("[^A-Za-z0-9]", "");
        String reversed = new StringBuilder(toReverse).reverse().toString();
        return reversed.equalsIgnoreCase(toReverse);
    }
}
