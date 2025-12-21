import java.util.Arrays;
public class NumberCount{
    public static void main(String[]args){
    
    int [] numbers = {2, 4, 4, -3, 5, 4};
    int check = 9;
    System.out.println(counter(numbers, check));

    
    }
        public static int counter(int[] numbers, int check){
        int count = 0;
        for(int index = 0; index < numbers.length; index++){
            if (numbers[index] == check){
            count++;
            }
        }
        return count;


        }



}
