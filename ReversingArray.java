import java.util.Arrays;
public class ReversingArray{
    public static void main(String[]args){
    int[]array1 = {1,2,3,4,5,6};
   

    int[]array2 = new int[array1.length];


    for(int index = 0; index < array1.length; index++){
        array2[index] = array1[array1.length - 1 - index];
    }
    System.out.print(Arrays.toString(array2));
    

    
    }

}
