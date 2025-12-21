import java.util.Arrays;
public class ArrangeEvenOdd{
    public static void main(String[]args){
    
    int [] numbers = {1, 2, 4, 5, 7, 9, -2, -3};

    int [] newNumbers = new int [numbers.length];

    int left = 0;
    int right = numbers.length-1;

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] % 2 != 0){
                newNumbers[left++] = numbers[index];            
            }else
                newNumbers[right--] = numbers[index];
        
        }
        copy(numbers, newNumbers);
        System.out.println(Arrays.toString(numbers));

    
    }
        public static void copy(int[] numbers, int [] newNumbers){
            for(int index = 0; index < newNumbers.length; index++){
                numbers[index] = newNumbers[index];
            }
       
        }



}
