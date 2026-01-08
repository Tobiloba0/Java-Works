import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class StudentGrade2{
    
    public static int validPositiveNumber(String input){
        int value = Integer.parseInt(input);
        if(value <= 0){
            throw new IllegalArgumentException("Value must be greater than zero.");
        }
        return value;
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        while(true){
            try{        
            System.out.println("How many students do you have?: ");
            int numberOfStudents = validPositiveNumber(input.nextLine());
                break;
            }catch(NumberFormatException e){
                System.out.println("Enter a valid number. ");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            
            }
        }
        
        while(true){
            try{
                System.out.println("How many subjects do they offer?: ");
                int numberOfSubjects = validPositiveNumber(input.nextLine());
                    break;
            }catch(NumberFormatException e){
                System.out.println("Enter a valid Number");
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }        
        }
        //saving values
        ArrayList <String> subjects = new ArrayList<>();
        int[][] scores = new int[numberOfStudents][numberOfSubjects]; 
        int[] totals = new int [numberOfStudents];
        double[] averages = new double [numberOfStudents];
        int[] positions = new int [numberOfStudents];
    
        for(int index = 0; index < numberOfSubjects; index++){
            System.out.println("Enter name of subject " + (index+1) + ": ");
            subjects.add(input.nextLine());
        }
        
        //scores
        
        for(int students = 0; students < numberOfStudents; students++){
            System.out.println("Entering scores for student " + (students + 1));
            for(int subjects = 0; subjects < numberOfSubjects; subjects++){
                while(true){
                    try{    
                        System.out.println("Enter score for "+ subject.get(subjects) +": ");
                        int score = Integer.parseInt(input.nextLine());
                        if(score < 0 || score > 100)
                            throw new IllegalArgumentException("Score must be 0 - 100");
                        scores[students][subjects] = score; 
                        totals[students] += score;
                        break;
                                     
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        
                        }
                    }
            }
            averages[students] = (double)totals[students] / numberOfSubjects;
        
        }
        
        //position 
        for(int index = 0; index < numberOfStudents; index++){
            int position = 1;
            for(int count = 0 ;count < numberOfStudents; count++){
                if(totals[index] > totals[count]){ 
                    position++;
                
                }
            }
            postions[index] = position;
        }
    
        //table output
        System.out.println("\n==========================================================");
        System.out.printf("%-10s", "STUDENT");
        
    }//main closed


}
