package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class TextProcessorTest {

    @Disabled
    void testToUpperCase() {
        TextProcessor textProcessor = new TextProcessor();
        String result = textProcessor.toUpperCase("hello", "world");
        assertNotEquals("HELLO WORLD", result);
    }

    @RepeatedTest(20)
    void testToLowerCase() {
        TextProcessor textProcessor = new TextProcessor();
        String result = textProcessor.toLowerCase("hello ", "world");
        assertEquals("hello world", result);
    }

    @Test
    void testStringBuilder() {
        TextProcessor textProcessor = new TextProcessor();
        String result = textProcessor.StringBuilder("Wonderland");
        assertEquals("Wonderland", result);
    }
}

