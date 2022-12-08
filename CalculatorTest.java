import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void checkAddingNumbersWorks(){
        Calculator calculator = new Calculator();
        int result = calculator.Add("1,2");
        assertEquals(3, result);
    }
    
}
