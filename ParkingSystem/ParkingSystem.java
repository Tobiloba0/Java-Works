import java.util.ArrayList;
import java.util.List;
public class ParkingSystem{
    private static final int TOTAL_SLOTS = 20;
    private List <Integer> parkingSlots;
    
    public ParkingSystem(){
    parkingSlots = new ArrayList<>();

        for(int index = 0; index < TOTAL_SLOTS; index++){
            parkingSlots.add(0);
        }
    
    }

    public boolean parkAutomatically(){
        for(int index = 0; index < TOTAL_SLOTS; index ++){
            if(parkingSlots.get(index) == 0){
                parkingSlots.set(index, 1);
                return true;
            }
        }
    return false;   
    }
    
    public boolean parkAtSlot(String slotNumber){
        int slotNumberValue = isValidNumber(slotNumber);
        if(slotNumberValue > 0 && parkingSlots.get(slotNumberValue - 1) == 0){
            parkingSlots.set(slotNumberValue - 1, 1);
            return true;
        }
        return false;
    }
    
    public boolean leaveSlot(String slotNumber){
        int slotNumberValue = isValidNumber(slotNumber);
        if(slotNumberValue > 0 && parkingSlots.get(slotNumberValue -1) == 1){
            parkingSlots.set(slotNumberValue - 1, 0);
            return true;
        }
        return false;
    }
    
    public boolean parkingStatus(String slotNumber){
        int slotNumberValue = isValidNumber(slotNumber);
        for(int index = 0; index < TOTAL_SLOTS; index++){
            if (slotNumberValue > 0 && parkingSlots.get(index) == 1){
                return true;
            }
        }
        return false;    
    }
    
    public void displayStatus(){
        System.out.println("\n======= PARKING STATUS =======");
        
        System.out.print("Occupied Slots: ");
        for(int index = 0 ; index < TOTAL_SLOTS; index++){
            if(parkingSlots.get(index) == 1){
                System.out.println((index + 1) + " is occupied");            
            }
        }
        
        System.out.println("\n----Free Slots----");
        for(int index = 0 ; index < TOTAL_SLOTS; index++){
            if(parkingSlots.get(index) == 0){
                System.out.println((index + 1) + " is free");            
            }
        }
        System.out.println("\n-------------------------");
    }
    
    public int isValidNumber(String slotNumber){
        try{
            int slotNumberValue = Integer.parseInt(slotNumber);
                if(slotNumberValue > 0 && slotNumberValue <= TOTAL_SLOTS){
                    return slotNumberValue;
                }else{
                System.out.println("Number is not valid");
                return -1;        
                }   
            }catch(NumberFormatException e){
                System.out.println("Invalid entry. Try again!!");  
                return -1;
            }//catch closed
    
    }//method closed

}//class closed
    

