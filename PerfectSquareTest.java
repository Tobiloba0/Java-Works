import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PerfectSquareTest{
    
    @Test
    void testAllPerfect(){
        int[]input = {4,9,25,49};
        boolean[] expected = {true, true, true, true};

        assertArrayEquals(expected, PerfectSquares.isPerfect(input));

    }

    @Test
    void testNegativeNumbers(){
        int[] input = {-8, 0,10};
        boolean[] expected = {false, true, false};
        assertArrayEquals(expected, PerfectSquares.isPerfect(input));
    }
    
    @Test
    void testEmptyArray(){
        int[]input = {};
        boolean []expected = {};
        assertArrayEquals(expected, PerfectSquares.isPerfect(input));
    
    
    }



}
