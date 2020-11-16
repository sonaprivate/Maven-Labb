package se.iths;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("2 + 2 = 4")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testSubstrack() {
        Calculator calculator = new Calculator();
        assertFalse(calculator.substrack(2, 2) == 6);
    }

    @Test
    void testMultipy() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @BeforeEach
    void beforeEachTest () {
        System.out.println("Denna rad ska skrivas ut innan varje test");
    }
}
