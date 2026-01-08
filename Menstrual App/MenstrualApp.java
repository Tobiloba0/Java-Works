import java.time.LocalDate;
import java.util.Scanner;
public class MenstrualApp{
    private LocalDate lastPeriodDate;
    private int cycleLength;
    private int flowDuration;

    public MenstrualApp(LocalDate lastPeriodDate, int cycleLength, int flowDuration){
        this.lastPeriodDate = lastPeriodDate;
        this.cycleLength = cycleLength;
        this.flowDuration = flowDuration;
    }
    
    public LocalDate getNextPeriodDate(){
        return lastPeriodDate.plusDays(cycleLength);    
    }
    
    public LocalDate getFlowEndDate(){
        return lastPeriodDate.plusDays(flowDuration);   
    }
    
    public LocalDate getOvulationDate(){
        return lastPeriodDate.plusDays(cycleLength - 14);
    }
    
    public LocalDate getFertileStartDate(){
        return getOvulationDate().minusDays(5);
    }
    
    public LocalDate getFertileEndDate(){
        return getOvulationDate();
    }
    public LocalDate getSafePeriodBefore(){
        return lastPeriodDate.plusDays(flowDuration);
    }
    public LocalDate getSafePeriodAfter(){
        return getOvulationDate().plusDays(1);  
    }
    public void display(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter last menstruation date: ");
        LocalDate startDate = input.nextInt();
        
    }
    
}
