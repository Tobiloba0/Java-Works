import java.util.Arrays;
public class CombiningArrayAlternate2{
    public static void main(String[]args){
    int[] array1 = {1,2,3,4,5,6,7,8};
    int[] array2 = {9,10,11,12,13,14,15,16,17,20,21,22,23,24,25};

    int[] array3 = new int [array1.length + array2.length];


    int array1current = 0;
    int array2current = 0;
    int array3current = 0;

        while(array1current < array1.length && array2current < array2.length){
        array3[array3current] = array1[array1current];
        array1current++;
        array3current++;

        array3[array3current] = array2[array2current];
        array2current++;
        array3current++;
        }

        while(array1current < array1.length){
        array3[array3current] = array1[array1current];
        array1current++;
        array3current++;
        }

        while(array2current < array2.length){
        array3[array3current] = array2[array2current];
        array2current++;
        array3current++;
        }
        
        System.out.println(Arrays.toString(array3));

    





    }

}
