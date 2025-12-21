import java.util.Arrays;
public class CombiningArray2{
    public static void main(String[]args){
    int[]array1 = {1,2,3,4,5,6};
    int[]array2 = {7,8,9,};

    int[]array3 = new int[array1.length + array2.length];

    for(int index = 0; index < array1.length; index++){
        array3[index] = array1[index];

    }

    for(int index = 0; index < array2.length; index++){
        array3[index + array1.length] = array2[index];
    }
    System.out.print(Arrays.toString(array3));
    

    
    }

}
