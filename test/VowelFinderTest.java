package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.VowelFinder;

public class VowelFinderTest {
    
    @Test
    public void testGetStringWithMostVowels() {
        String[] words = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        assertEquals("Resourceful", VowelFinder.getStringWithMostVowels(words));
    }
    
    @Test
    public void testEmptyArray() {
        String[] words = {};
        assertEquals("", VowelFinder.getStringWithMostVowels(words));
    }

    @Test
    public void testSingleWord() {
        String[] words = {"Hello"};
        assertEquals("Hello", VowelFinder.getStringWithMostVowels(words));
    }

    @Test
    public void testSameVowelCount() {
        String[] words = {"Sunshine", "Umbrella"};
        assertEquals("Sunshine", VowelFinder.getStringWithMostVowels(words)); // First with 3 vowels
    }
}
