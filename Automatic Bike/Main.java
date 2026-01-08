public class Main{
    public static void main(String [] args){
    AutomaticBike bike = new AutomaticBike();
        
    bike.turnOn();
    bike.accelerate();
  
    for(int index = 0; index < 5; index++){
     bike.accelerate();
    }
  
    System.out.println(bike.getSpeed());

    System.out.println(bike.getGear());
    }
}
