public class AutomaticBike{
    private boolean isOn;
    private int speed;
    private int gear;
    
    public AutomaticBike(){
        isOn = false;
        speed = 0; 
        gear = 0;             
    }

    public void turnOn(){
        isOn = true;       
    }
    
    public void turnOff(){
        isOn = false;
        speed = 0;       
    }
    
    public boolean isOn(){
        return isOn;
    }    

    public void accelerate(){
        if(!isOn) return;
 
        if(speed <= 20){
            speed++;
        }else if(speed < 31){
            speed += 2; 
        }else if(speed < 41){
            speed += 3;    
        }else if(speed > 40){
            speed += 4;
        }
    }

    public void decelerate(){
        if(!isOn || speed == 0) return;

        if(speed <= 20){
            speed--;
        }else if(speed < 31){
            speed-=2;
        }else if(speed < 41){
            speed-=3;  
        }else if(speed > 40){
            speed-=4;
        }
        
        if(speed < 0)
            speed = 0;
    }
    
    public int getGear(){
        int speed = getSpeed();
        if(speed < 21){
            gear = 1;        
        }else if(speed < 31){
            gear = 2;
        }else if(speed < 41){
            gear = 3;
        }else if(speed > 40){
            gear = 4;
        }
        return gear;
    }
    
    public int getSpeed(){
        return speed;  
    }
}
