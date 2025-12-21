import java.util.*;

public class CombineArray{
    public static void main(String[]args){
    int [] fristArray = {15, 8, 12, 17,1, 20, 21};
    int [] secondArray = {30, 19, 55, 40, 22, 19, 15, 3, 30, };
    
    System.out.println(Arrays.toString(combineArray(fristArray, secondArray)));

    }
    public static int [] combineArray(int[] firstArray, int[] secondArray){

    int [] newArray = new int [firstArray.length + secondArray.length];

    int firstArrayCount = 0;
    int secondArrayCount = 0;
    
    for(int count = 0; count <= newArray.length; count++){
    
    if(firstArrayCount < firstArray.length){
        newArray[count] = firstArray[firstArrayCount];
        firstArrayCount++;

    }
    if(secondArrayCount < secondArray.length){
        newArray[count++] = secondArray[secondArrayCount];
        secondArrayCount++;  
    }    
   
     


    }
    return newArray;


}

}
