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
    
    public static String checkSubject(String subject){
        if (subject == null || subject.trim().isEmpty()){
            throw new IllegalArgumentException("Subject cannot be empty.");
        }

        if(!subject.matches("[a-zA-Z0-9 ]+")){
            throw new IllegalArgumentException("Subject contains invalid charaters");
        }
        return subject;   
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int numberOfStudents = 0;
        int numberOfSubjects = 0;

        while(true){
            try{        
            System.out.println("How many students do you have?: ");
            numberOfStudents = validPositiveNumber(input.nextLine());
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
                numberOfSubjects = validPositiveNumber(input.nextLine());
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
        int[][] subjectPositions = new int [numberOfStudents][numberOfSubjects];
        int[] subjectTotal = new int [numberOfSubjects];
        double[] subjectAverage = new double [numberOfSubjects];
        double [] subjectTotalAverage = new double [numberOfSubjects];
        int[] numberOfPasses = new int [numberOfSubjects];
        int largestSubjectPassedIndex = 0;
        int largestSubjectFailedIndex = 0;
        int largestFailedValue = 0;
        int largestPassedValue = 0;
        int[] numberOfFail = new int [numberOfSubjects];
        int[] subjectBestStudents = new int [numberOfStudents];
        int[] subjectWorstStudents = new int [numberOfStudents];
        int[] subjectBestStudentIndex = new int [numberOfSubjects];
        int[] subjectWorstStudentIndex = new int [numberOfSubjects];
        int smallestScore = 0;
        int largestScore = 0;
        int largestFail = 0;
        int largestPass = 0;
        
        //enter subject
        
        for(int index = 0; index < numberOfSubjects; index++){
            while(true){
                try {
                    System.out.println("Enter name of subject " + (index+1) + ": ");
                    String subject = checkSubject(input.nextLine());
                    subjects.add(subject);
                    break;
                } catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
                
            }
        }
        //scores
        for(int students = 0; students < numberOfStudents; students++){
            System.out.println("Entering scores for student " + (students + 1));
            for(int subjectsCount = 0; subjectsCount < numberOfSubjects; subjectsCount++){
                while(true){
                    try{    
                        System.out.println("Enter score for "+ subjects.get(subjectsCount) +": ");
                        int score = Integer.parseInt(input.nextLine());
                        if(score < 0 || score > 100)
                            throw new IllegalArgumentException("Score must be 0 - 100");
                        scores[students][subjectsCount] = score; 
                        totals[students] += score;
                        break;
                                     
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
            }
            averages[students] = (double)totals[students] / numberOfSubjects;
        
        }
        
        //subject position
        for(int subject = 0; subject < numberOfSubjects; subject++){
            for(int student = 0; student < numberOfStudents; student++){
                int subjectPosition = 1;
                for(int otherStudent = 0; otherStudent < numberOfStudents; otherStudent++){
                    if (scores[otherStudent][subject] > scores[student][subject]){
                    subjectPosition++;
                    }
               
                }

                subjectPositions[student][subject] = subjectPosition;
            }
        }

       //find highest subject scores
         for(int subject = 0; subject < numberOfSubjects; subject++){
             int subjectBestStudent = scores[0][subject];

            for(int student = 1; student < numberOfStudents; student++){
            
               if(scores[student][subject] > subjectBestStudent){
                subjectBestStudent = scores[student][subject];
                  
                }

            }
         subjectBestStudents[subject] = subjectBestStudent; 
        }

        //find highest subject index=============
         for(int subject = 0; subject < numberOfSubjects; subject++){
             int subjectBestIndex = 0;

            for(int student = 1; student < numberOfStudents; student++){
            
               if(scores[student][subject] > scores[subjectBestIndex][subject]){
                    subjectBestIndex = student;
                }
                
            }
        subjectBestStudentIndex[subject] = subjectBestIndex + 1; 
        }

         //find lowest subject scores
        for(int subject = 0; subject < numberOfSubjects; subject++){
             int subjectWorstStudent = scores[0][subject];
            for(int student = 1; student < numberOfStudents; student++){
            
               if(scores[student][subject] < subjectWorstStudent){
                    subjectWorstStudent = scores[student][subject];
                  
                }

            }
            subjectWorstStudents[subject] = subjectWorstStudent; 
        }

        //find lowest score in subject index=============
         for(int subject = 0; subject < numberOfSubjects; subject++){
             int subjectWorstStudent = 0;
            for(int student = 1; student < numberOfStudents; student++){
            
               if(scores[student][subject] < scores[subjectWorstStudent][subject]){
                    subjectWorstStudent = student;
                }

            }
          subjectWorstStudentIndex[subject] = subjectWorstStudent+1;   
        }

        //finding subject total average
        for(int index = 0; index < numberOfSubjects; index++){
            int total = 0;
           
            for(int count = 0; count < numberOfStudents; count++){
                total += scores[count][index];  
            }
                subjectTotal[index] = total;
                subjectTotalAverage[index] = ((double)total) / numberOfStudents;
        }
        
        //finding hardest subject i.e smallest total
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int small = 0;
            for(int count = 1; count < numberOfSubjects; count++){
                if(subjectTotal[count] < subjectTotal[subject]){
                    small = count;
                }
            }
            smallestScore = small + 1;   
        }
        //finding hardest subject i.e smallest total
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int large = 0;
            for(int count = 1; count < numberOfSubjects; count++){
                if(subjectTotal[count] > subjectTotal[subject]){
                    large = count;
                }
            }
            largestScore = large + 1;   
        }

        //Number of passes
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int passes = 0;
            for(int student = 0; student < numberOfStudents; student++){
                if(scores[student][subject] > 49){
                    passes++;
                  numberOfPasses[subject] = passes;
                }
            }
        }
        
        //largest passes 2 get number of easiest subject
        for(int subject = 0; subject < numberOfSubjects; subject++){
            largestPass = numberOfPasses[subject];
            for(int count = 1; count < numberOfSubjects; count++){
                if(numberOfPasses[count] > largestPass){
                    largestPass = numberOfPasses[count];
                }
            }
        }
        
        //largest passes 2 get number of easiest subject index
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int largestPassedindex = 0;
            for(int count = 1; count < numberOfSubjects; count++){
                if(numberOfPasses[count] > numberOfPasses[subject]){
                    largestPassedindex = count;
                }
            }
            largestSubjectPassedIndex = largestPassedindex +1;
        }

        //largest fails 2 get number of hardest subject index
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int largestFailedindex = 0;
            for(int count = 1; count < numberOfSubjects; count++){
                if(numberOfFail[count] > numberOfFail[subject]){
                    largestFailedindex = count;
                }
            }
            largestSubjectFailedIndex = largestFailedindex +1;
        }
        //Number of fail
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int fail = 0;
            for(int student = 0; student < numberOfStudents; student++){
                if(scores[student][subject] < 50){
                    fail++;
                  numberOfFail[subject] = fail;
                }
            }
        }

         //largest fail 2 get number of hardest subject
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int largest = numberOfFail[subject];
            for(int count = 1; count < numberOfSubjects; count++){
                if(numberOfFail[count] > largest){
                    largest = numberOfFail[count];
                }
            }
         largestFailedValue = largest;
        }
        

        //mostPassedSubject ie least number of failure
        for(int subject = 0; subject < numberOfSubjects; subject++){
            int largest = numberOfPasses[subject];
            for(int count = 1; count < numberOfSubjects; count++){
                if(numberOfPasses[count] > largest){
                    largest = numberOfPasses[count];
                }
            }
            largestPassedValue = largest;   
        }
        
        //class position 
        for(int index = 0; index < numberOfStudents; index++){
            int position = 1;
            for(int count = 0 ;count < numberOfStudents; count++){
                if(totals[count] > totals[index]){ 
                    position++;
                }
            }
            positions[index] = position;
        }
    
        //table output
            System.out.println("\n==========================================================");
            System.out.printf("%-15s", "STUDENT");

        for(int index = 0 ; index < numberOfSubjects; index++){
            System.out.printf("SUB%-3d", index + 1);
        }
            
            System.out.printf("%6s %7s %6s \n", "TOT", "AVE", "POS");
            System.out.println("==========================================================");
        for(int index = 0; index < numberOfStudents; index++){
            System.out.printf("Student%d %-3s", (index+1), " ");
            for(int count = 0; count < numberOfSubjects; count++){
                System.out.printf("%-3s %d" ," ", scores[index][count]);
            }
            System.out.printf("%-5s %-4d %-1s %-4.2f %-2s %-4d\n", " ",totals[index], " ", averages[index], " ", positions[index]);
        }
            System.out.println("\n==========================================================");
            System.out.println("\n==========================================================");
                        
            System.out.println("SUBJECT SUMMARY"); 
        for(int index = 0; index < numberOfSubjects; index++){
            System.out.println("Subject " + (index+1));
            System.out.println("Highest scoring student is: " + "Student " + subjectBestStudentIndex[index] + " scoring " + subjectBestStudents[index]);
            System.out.println("Lowest scoring student is: " + "Student " + subjectWorstStudentIndex[index] + " scoring " + subjectWorstStudents[index]);
            System.out.println("Total score is "+ subjectTotal[index]);
            System.out.println("Average score is "+ subjectTotalAverage[index]);
            System.out.println("Number of Passes: "+ numberOfPasses[index]);
            System.out.println("Number of Fails: "+ numberOfFail[index]);
            System.out.println();

   
        }
            // overallSummary
            System.out.println("The hardest subject is Subject " + largestSubjectFailedIndex + " with " + largestFailedValue + " failures");
            System.out.println("The easiest subject is Subject " + largestSubjectPassedIndex + " with " + largestPassedValue + " passes");
            System.out.println("The overall Highest score is scored by Student");
            System.out.println("The overall Lowest score is scored by Student");
            System.out.println("\n==========================================================");
            System.out.println();
            System.out.println();
            System.out.println("CLASS SUMMARY");
            System.out.println("===========================================================");
            System.out.println("Best Graduating Student is: ");
            System.out.println("===========================================================");
            System.out.println();
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Worst Graduating Student is: ");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println();
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("Class total score is: ");
            System.out.println("Class Average score is: ");
            System.out.println("=====================================================");
    }//main closed

}
