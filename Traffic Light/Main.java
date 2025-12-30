public class Main{
    public static void main(String[]args){
    
    TrafficLight light = new TrafficLight("red", 30);   
    //printing light
    System.out.println("The light is " + light.getColor() + ": " + light.isRed());
    
    light.setColor("green");
    System.out.println("The light is " + light.getColor() + ": " + light.isRed());
    
    System.out.println("The light is now " + light.getColor() + ": " + light.isGreen());
    
    light.setDuration(30);
    System.out.println("The light is duration is: " + light.getDuration());
    
    light.setDuration(20);

    System.out.println("The light is duration is now: " + light.getDuration());
    }
}
