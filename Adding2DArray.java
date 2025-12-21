public class Adding2DArray{
    public static void main(String[]args){
    
    int[][] integers = {
        {1, 10, 3, 8},
        {9, 12, 6, 7},
        {5, 12, 11, 4},
    };//array closed

   
    int sumRow2 = 0;
    int sumRow3 = 0;

    int sumColumn1 = 0;
    int sumColumn2 = 0;
    int sumColumn3 = 0;
    int sumColumn4 = 0;

        for(int row = 0; row < 3; row++){
            int sum = 0;
            for(int column = 0; column < 4; column++){
                sum += integers[row][column];
            }
            System.out.println("The sum of row " + (row + 1) + " is : " + sum);
        }
      System.out.println();

        for(int coller = 0; coller < 4; coller++){
            int summer = 0;
            for(int roller = 0; roller < 3; roller++){
                summer+= integers[roller][coller];
            }
         
           System.out.println("The sum of column " + (coller + 1) + " is : " + summer);        
           
        }
        
        



    }



}
