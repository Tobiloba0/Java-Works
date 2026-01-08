import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class MenstrualCycleTest{
    
    @Test
    void textNextPeriodDate(){
        MenstrualApp cycle = new MenstrualCycle(LocalDate.of(2026,1, 1), 28, 5);
        assertEquals(LocalDate.of(2025, 1, 29),
            cycle.getNextPeriodDate());
    }

    @Test
    void testOvulationDate(){
        MenstrualApp cycle = new MenstrualCycle(LocalDate.of(2026,1, 1), 28, 5);
        assertEquals(LocalDate.of(2025, 1, 15), cycle.getOvulationDate());    
        }
    
    @Test
    void testFertileWindow(){
        MenstrualApp cycle = new MenstrualCycle(LocalDate.of(2026,1, 1), 28, 5);
        assertEquals(LocalDate.of(2025, 1, 10), cycle.getFertileStartDate()); 
    
        assertEquals(LocalDate.of(2025, 1, 15), cycle.getFertileEndDate());  
    
    }

}
