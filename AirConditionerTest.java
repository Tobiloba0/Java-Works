import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest{
    
    @Test
    void testTurnOn(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    assertTrue(ac.isOn(), "AC should be on");
    
    }

    @Test 
    void testTurnOff(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    ac.turnOff();
    assertFalse(ac.isOn(), "Ac should be off");    
    }

    @Test
    void testIncreaseTemperature(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    int temp = ac.getTemperature();
    ac.increaseTemperature();
    assertEquals(temp + 1, ac.getTemperature());   
    }

    @Test
    void testDecreaseTemperature(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    int temp = ac.getTemperature();
    ac.decreaseTemperature();
    assertEquals(temp - 1, ac.getTemperature());
     
    }

    @Test
    void testMaximumTemperatureLimit(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();
    
    for(int index = 0; index < 20; index++){
        ac.increaseTemperature();    
    }
    
    assertEquals(30, ac.getTemperature());
        
    }

    @Test
    void testMinimumTemperature(){
    AirConditioner ac = new AirConditioner();
    ac.turnOn();

        for(int index = 0; index < 20; index++){
            ac.decreaseTemperature();    
        }  
    assertEquals(16, ac.getTemperature());  
    }

}
