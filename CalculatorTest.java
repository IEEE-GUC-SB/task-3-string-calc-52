import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void checkAddingNumbersWorks(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("1,2");
        assertEquals(3, result);
    }

    @Test
    void checkIfEmptyStringWorksAsZero(){
        Calculator calculator = new Calculator();
        int result = calculator.Add(",2");
        assertEquals(2, result);
    }

    @Test
    void checkIfNewLinesAllowedToGetAdded(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    void supportDifferentDelimiterIfUserWants(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("//;\n1;2");
        assertEquals(3, result);
    }

}
