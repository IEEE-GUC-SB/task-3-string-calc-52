import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    void checkAddingNumbersWorks() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("1,2");
        assertEquals(3, result);
    }

    @Test
    void checkIfEmptyStringWorksAsZero() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add(",2");
        assertEquals(2, result);
    }

    @Test
    void checkIfNewLinesAllowedToGetAdded() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("1\n2,3");
        assertEquals(6, result);
    }

    @Test
    void supportDifferentDelimiterIfUserWants() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("//;\n1;2");
        assertEquals(3, result);
    }

    @Test
    void checkNoNegativeNumbers() throws Exception{
        Calculator calculator = new Calculator();
        Exception thrown = assertThrows(
            Exception.class,
            () -> calculator.Add("1,-2,-3"),
            "Expected doThing() to throw, but it didn't"
        );
 
     assertTrue(thrown.getMessage().contains("negative numbers not allowed -2 -3"));
    }

    @Test
    void GreaterThan1000Ignored() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("2,1001");
        assertEquals(2, result);
    }

    @Test
    void allowsLengthyDelimiters() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("//[***]\n1***2***3");
        assertEquals(6, result);
    }

    @Test
    void allowsMultipleDelimiters() throws Exception{
        Calculator calculator = new Calculator();
        int result = calculator.Add("//[*][%]\n1*2%3");
        assertEquals(6, result);
    }

}
