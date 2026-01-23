import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldReturnCorrectSumWhenTwoNumbers() {
        // Arrange
        Calculator calc = new Calculator();
        int firstNumber = 6;
        int secondNumber = 7;
        int expected = 13;

        // Act
        int actual = calc.sum(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, actual, "La somma di 6 e 7 dovrebbe essere 13");
    }
}
