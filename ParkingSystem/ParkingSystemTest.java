import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingSystemTest{

    @Test
    void testAutomaticParking(){
        ParkingSystem parking = new ParkingSystem();
        assertTrue(parking.parkAutomatically());    
    
    }

    @Test
    void testSpecificSlotParking(){
        ParkingSystem parking = new ParkingSystem();
        assertTrue(parking.parkAtSlot("10"));
        assertFalse(parking.parkAtSlot("10")); //already occupied
            
    }
    
    @Test
    void testLeaveSlot(){
        ParkingSystem parking = new ParkingSystem();
        parking.parkAtSlot("3"); 
        assertTrue(parking.leaveSlot("3"));
        assertFalse(parking.leaveSlot("3"));           
    }

    @Test
        void testInvalidSlot() {
        ParkingSystem parking = new ParkingSystem();
        assertFalse(parking.parkAtSlot("25"));
        assertFalse(parking.leaveSlot("0"));
    }

}


