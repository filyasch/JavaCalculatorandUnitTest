import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), "2 + 3 должно быть 5");
    }

    @Test
    void testSubtract() {
        assertEquals(1.0, calculator.subtract(5.0, 4.0), "5 - 4 должно быть 1");
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), "2 * 3 должно быть 6");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), "6 / 3 должно быть 2");
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5.0, 0.0);
        });

        assertEquals("Деление на ноль невозможно", exception.getMessage());
    }
}
