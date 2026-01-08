import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class ParkingSystemTest{
    
    @Test
    void testBikeTurnOn(){
    AutomaticBike Bike = new AutomaticBike();
    Bike.turnOn();
    assertTrue(Bike.isOn());
    
    }

    @Test
    void testBikeTurnOff(){
    AutomaticBike Bike = new AutomaticBike();
    Bike.turnOn();
    Bike.turnOff();
    assertFalse(Bike.isOn());
    
  
}
