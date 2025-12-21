public class Largest2DArray{
    public static void main(String[]args){
    
    int[][] integers = {
        {1, 10, 3, 8},
        {9, 12, 6, 7},
        {20, 2, 11, 4},
    };//array closed
    
    for(int row = 0; row < 3; row++){
  
     System.out.println("Max of Row " + (row + 1) + ": " + getMax(integers[row]));
    }
   
 





    }
        public static int getMax(int[]integers){
        int max = integers[0];
            for(int index = 0; index < integers.length; index++){
              max = (integers[index] > max) ? integers[index] : max;  
            }  
        return max; 
        }
}
