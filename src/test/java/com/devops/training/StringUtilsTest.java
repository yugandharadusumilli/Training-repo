package com.devops.training;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
    
    @Test
    public void testIsEmpty() {
        assertTrue(StringUtils.isEmpty(null));
        assertTrue(StringUtils.isEmpty(""));
        assertTrue(StringUtils.isEmpty("   "));
        assertFalse(StringUtils.isEmpty("test"));
    }
    
    @Test
    public void testReverse() {
        assertNull(StringUtils.reverse(null));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("olleh", StringUtils.reverse("hello"));
        assertEquals("54321", StringUtils.reverse("12345"));
    }
    
    @Test
    public void testIsPalindrome() {
        assertFalse(StringUtils.isPalindrome(null));
        assertFalse(StringUtils.isPalindrome(""));
        assertTrue(StringUtils.isPalindrome("racecar"));
        assertTrue(StringUtils.isPalindrome("A man a plan a canal Panama"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }
    
    @Test
    public void testCountWords() {
        assertEquals(0, StringUtils.countWords(null));
        assertEquals(0, StringUtils.countWords(""));
        assertEquals(0, StringUtils.countWords("   "));
        assertEquals(1, StringUtils.countWords("hello"));
        assertEquals(5, StringUtils.countWords("The quick brown fox jumps"));
    }
    
    @Test
    public void testCapitalize() {
        assertNull(StringUtils.capitalize(null));
        assertEquals("", StringUtils.capitalize(""));
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("World", StringUtils.capitalize("WORLD"));
        assertEquals("Test", StringUtils.capitalize("tEsT"));
    }
}
