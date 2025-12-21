public class Locate{
    public static void main(String[]args){

    int[] numbers = {10,12,79,070,27,49,32,71};
    System.out.println(itExist(49,numbers));

    }

        public static int itExist(int number, int [] numbers){
        
        int mainValue = 4;
        int negative = -1;

        for (int index = 0; index < numbers.length; index++){
            if (number ==numbers[index]){
           
            return mainValue;
            }

        }
         return negative;

                
    }
}
