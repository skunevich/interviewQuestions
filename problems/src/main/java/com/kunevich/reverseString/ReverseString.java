package com.kunevich.reverseString;

/**
 * @author Sean Kunevich <sean@kunevich.com>
 */
public class ReverseString {
    public String reverseStringStringBuilderSolution(String toReverse) {
        return new StringBuilder(toReverse).reverse().toString();
    }

    public String reverseStringOldSchool(String toReverse) {
        String reversedString = "";

        char[] toReverseCharArray = toReverse.toCharArray();
        for (int i = toReverseCharArray.length-1; i >= 0; i--) {
            reversedString = reversedString + toReverseCharArray[i];
        }

        return reversedString;
    }

    public String reverseStringUsingRecursion(String toReverse) {
        if(toReverse.length() <= 1) {
            return toReverse;
        }
        return reverseStringUsingRecursion(toReverse.substring(1)) + toReverse.charAt(0);
    }

    public String reverseStringSwap(String toReverse) {
        if(toReverse.length() <= 1) {
            return toReverse;
        }

        char[] reversed = toReverse.toCharArray();
        for(int i = 0; i<reversed.length/2; i++) {
            char temp = reversed[reversed.length-i-1];
            reversed[reversed.length-i-1] = reversed[i];
            reversed[i] = temp;
        }

        return new String(reversed);
    }
}
