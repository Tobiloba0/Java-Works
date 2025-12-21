public class LargestElementNested{
    public static void main(String[]args){
    int [] numbers = {4,5,7,4,9,3}

    }
        public static int Largest(int numbers[]){
        int largest = numbers[0]   ;
        for (int index = 0; index < numbers.length; numbers++){
           if (numbers[index] > largest){
               numbers = largest;            
            }
            return largest;
            
        }
        
    
        }
    

}
