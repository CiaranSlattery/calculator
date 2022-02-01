import ie.gmit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calculator.add(10,5));

    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10,5));

    }

    @Test
    void testMultiply() {
        assertEquals(25, calculator.multiply(5,5));

    }

    @Test
    void testDivide() {
        assertEquals(6, calculator.divide(60,10));

    }
}
