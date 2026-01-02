public class Main{
    public static void main(String[]args){
    
    ParkingSystem parking = new ParkingSystem();
    parking.displayStatus();
    parking.parkAutomatically();
    System.out.println("Car parked automatically");
    parking.displayStatus();
    parking.parkAtSlot("5");
    System.out.println("Car parked at slot 5");
    parking.displayStatus();
    parking.leaveSlot("1");
    System.out.println("Car left slot 1");
    parking.displayStatus();
    
    }

}
