import java.util.Arrays;
public class CombiningArrayAlternate{
    public static void main(String[]args){
    int[]array1 = {1,2,3,4,5,6,8,6,4,3,5,6,7,8,};
    int[]array2 = {7,8,9,10,11,12};
    
    int[] array3 = new int [array1.length + array2.length];

    int positionInFirstArray = 0;
    int positionInSecondArray = 0;
    int positionInThirdArray = 0;

    while(positionInFirstArray < array1.length && positionInSecondArray < array2.length){
    
    array3[positionInThirdArray] = array1[positionInFirstArray];
    positionInFirstArray++;
    positionInThirdArray++;

    array3[positionInThirdArray] = array2[positionInSecondArray];
    positionInThirdArray++;
    positionInSecondArray++;

    }
    
    while(positionInFirstArray < array1.length){
        array3[positionInThirdArray] = array1[positionInFirstArray];
        positionInThirdArray++;
        positionInFirstArray++;    
    }

    while(positionInSecondArray < array2.length){
        array3[positionInThirdArray] = array2[positionInSecondArray];
        positionInThirdArray++;
        positionInSecondArray++;    
    }

    System.out.println(Arrays.toString(array3));
    
    
    

    
    }

}
