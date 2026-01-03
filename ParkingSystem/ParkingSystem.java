import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
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

        if(slotNumberValue == -1){
            return false;
        }
        if(slotNumberValue > 0 && parkingSlots.get(slotNumberValue -1) == 1){
            parkingSlots.set(slotNumberValue - 1, 0);
            return true;
        }else if(slotNumberValue > 0 && parkingSlots.get(slotNumberValue -1) == 0){
             return false;
        }
        return false;           
    }
    
    public void parkingStatusOfSlot(String slotNumber){
        int slotNumberValue = isValidNumber(slotNumber);
        
        if(slotNumberValue == -1){
            return;
        }
        
        int index = slotNumberValue -1;
       
        if (parkingSlots.get(index) == 1){
            System.out.println("This slot is unavailable. ");
        }else{
            System.out.println("This slot is available.");   
            }
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
                System.out.println("Invalid entry. Going back to Menu");  
                return -1;
            }//catch closed
    
    }//method closed
        public void menu(){
        Scanner input = new Scanner(System.in);
        ParkingSystem parking = new ParkingSystem();
        boolean isTrue = true;
        while(isTrue){
            System.out.println("====== Welcome to Parking Lot ======== ");
            System.out.println("Select one of the options below");
            
            String menu = ("""
            1. Display status of Lot
            2. Park Automatically
            3. Park at spcific slot
            4. Leave slot
            5. Check parking status of a slot
            6. Exit
            
            """);
            System.out.println(menu);
            String userInput = input.nextLine();
            int choice;

            try{
                choice = Integer.parseInt(userInput);
            }catch(NumberFormatException e){
                System.out.println("Please enter a valid number");
                continue;
            }
        
        switch(choice){
            case 1 -> parking.displayStatus();
            case 2 -> {
                        parking.parkAutomatically();
                        System.out.println("Parked successfully at the first available slot on the left");
                      }
            case 3 -> {
                        System.out.println("Enter slot Number");
                        String userInputValue = input.nextLine();
                        parking.parkAtSlot(userInputValue);
                        System.out.println("Parked at slot " + userInputValue + " successfully");
                       }
            case 4 -> {
                        System.out.println("Enter slot Number");
                        String userInputValue = input.nextLine();
                        boolean result = parking.leaveSlot(userInputValue);
                        if(result){
                          System.out.println("Left slot " + userInputValue + " successfully");
                        }else
                            System.out.println("Slot " + userInputValue + " is not occupied");

                       }
            case 5 -> {
                        System.out.println("Enter slot Number");
                        String userInputValue = input.nextLine();
                        parking.parkingStatusOfSlot(userInputValue);
                       }
            case 6 -> {
                        System.out.println("Exiting the program...");
                        isTrue = false;
                      }
            default -> System.out.println("Invalid option");    
      
        }//switch closed

        }//while closed
    }//menu closed

}//class closed
    

