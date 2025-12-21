import java.util.Arrays;
import java.awt.Point;
import java.util.Scanner;
public class ArrayPoint{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of array between 1 and 20: "); 
    int length = input.nextInt(); 

    while(length <= 0 || length > 20){
    System.out.print("Invalid entry!!. Please try again: "); 
    length = input.nextInt(); 
    }

    Point[] points = new Point[length];

    fillingArray(points);

    printArray(points);
    


    }
    public static void fillingArray(Point[] points){
    Scanner input = new Scanner(System.in);
    
        for(int index = 0; index < points.length; index++){
        System.out.print("Enter x and y: ");
        points[index] = new Point(input.nextInt(), input.nextInt());

        }

    }
    public static void printArray(Point[] points){
        System.out.println("Your array is:");
        
            for(int index = 0; index < points.length; index++){
                System.out.print(points[index].x + "," + points[index].y);
                
            }

    }
    

}
