public class TrafficLight{
    private String color;
    private int duration;
    
    public TrafficLight(String color, int duration){
      this.color = color;
      this.duration = duration;
            
    }
    
    public void setColor(String color){
      this.color= color;
    }
    
    public String getColor(){
      return color;  
    }
    
    public void setDuration(int duration){
      this.duration = duration;    
    }
    public int getDuration(){
      return duration;    
    }
    
    public void changeColor(String newColor){
      color = newColor;   
    }
    
    public boolean isRed(){
        
      return color.equals("red");      
    }
    
    public boolean isGreen(){
      return color.equals("green");      
    }


}
