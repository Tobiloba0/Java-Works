public class LargestElement{
    public static void main(String[]args){
//    int [] numbers = {4,5,7,4,9,3};

    System.out.println(itExist(50));

    }// numbers
        public static int Largest(int []numbers){
        int largest = numbers[0];
        for(int index = 0; index < numbers.length; index++){
           if(numbers[0] < numbers[index]){
               largest = numbers[index];            
            }//
        }//loop
         return largest;
        int[] arrayReturned = new int[numbers.Length];

        for(int index = arrayLength - 1; index >= 0; index--){
        arrayReturned = numbers[index];
        }
    }

        public static int[] Reverse(int[] numbers){
        

        return arrayReturned;
}

        public static boolean itExist(int number){
        int[] numbers = {5,8,3,9,10,15};
        boolean itExist = true;

        for (int index = 0; index < numbers.length; index++){
            if (number ==numbers[index]){
            itExist=true;
            break;
            }else itExist=false;

        }
        return itExist;
}

//         public static int OddPosition(int number){
//            int [] numbers = {4,5,7,4,9,3,10,2,9,12};
//            int[] newList = int [nubmers.length/2]
//            
//            for(int index = 0; index < number.length; index++){
//             if (number[index] % 2){newList.insert}
//            }
//            
//            
//             return largest;
            
    }
}

