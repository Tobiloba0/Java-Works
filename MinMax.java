import java.util.Arrays;
public class MinMax{
    public static void main(String[]args){
    
    int [] numbers = {2, 4, 6, -3, 5};
    int min = numbers[0]; 
    int max = numbers[0];

    for(int index = 1; index < numbers.length; index++){
    min = (numbers[index] < min) ? numbers[index]: min;
    max = (numbers[index] > max) ? numbers[index]: max;      
    }

        System.out.println(min+ ", " +max);  

    }

}
