
import java.util.Scanner;
public class ArrayEntry{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of array between 1 and 20: "); 
    int length = input.nextInt(); 

    while(length <= 0 || length > 20){
    System.out.print("Invalid entry!!. Please try again: "); 
    length = input.nextInt(); 
    }
    int[] numbers = new int[length];

    fillingArray(numbers);

    printArray(numbers);
    


    }
    public static void fillingArray(int[]numbers){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the numbers to fill in the array: ");
        for(int index = 0; index < numbers.length; index++){
        numbers[index] = input.nextInt();

        }

    }
    public static void printArray(int[]numbers){
        System.out.println("Your array is:");
        System.out.print("[");
            for(int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index]);
                if(index < numbers.length -1){
                    System.out.print(", ");
                }
            }
        System.out.println("]");

    }
    

}
