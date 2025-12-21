import java.util.Scanner;
public class PerfectSquares {

    public static void main(String[] args) {

    int[]numbers = {4, 9, 25, 49};
    boolean[] answer = isPerfect(numbers);

    for(boolean value : answer){
        System.out.print(value + " ");
     }

    }
        function isPerfect(numbers){
              const result = [];
            for(int index = 0; index < numbers.length; index++){
                
                int num = numbers[index];

                boolean isPerfectSquare = false;

                    if(num >= 0){
                        for(int count = 0;count * count <= num; count++){
                             if(count * count == num){
                              isPerfectSquare = true;  
                                break;    
                            }                 
                        }                    
                    }
                    result[index] = isPerfectSquare;
                    }     
                return result;      
                }

            

        

}
