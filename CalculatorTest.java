import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{
    @Test
    void testAddition(){
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);

        assertEquals(5, result);

    }
    @Test    
    void testSubtraction(){
        Calculator calc = new Calculator();
        int result = calc.subtract(5, 2);
  
        assertEquals(3, result); 
       
    }

}
