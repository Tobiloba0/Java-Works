import java.util.ArrayList;
import java.util.Scanner;
public class GradeManager{
    private ArrayList<Student> students;
    private int numberOfSubjects;

    public GradeManager(){
        students = new ArrayList<>();

    }
    
    public void collectData(){
        Scanner input = new Scanner(System.in);
        int studentCount;
        while(true){
        System.out.print("Enter number of students: ");
        String studentStringCount = input.nextLine().trim();
            try{
                studentCount = Integer.parseInt(studentStringCount);
                if(studentCount < 0){
                    System.out.println("Invalid entry, value cannot be less than zero. Try again!!!");
                        continue;
                }else
                    break;

            }catch(NumberFormatException e){
            System.out.println("Invalid entry. Try again!!!");
        
            }//catch closed
        }//while closed

        int numberOfSubjects;
        while(true){
        System.out.print("Enter number of subjects: ");
        String subjectStringCount = input.nextLine().trim();
            try{
                numberOfSubjects = Integer.parseInt(subjectStringCount);
                if(numberOfSubjects < 0){
                    System.out.println("Invalid entry, value cannot be less than zero. Try again!!!");
                        continue;
                }else
                    break;

            }catch(NumberFormatException e){
            System.out.println("Invalid entry. Try again!!!");
        
            }//catch closed
        }//while closed
        
        for(int studentIndex = 1; studentIndex <= studentCount; studentIndex++){
        String studentName;
        while(true){
            System.out.print("Enter name of student " + studentIndex + ": ");
                studentName = input.nextLine().trim();
            if(studentName.isEmpty() || studentName.matches(".*\\d.*")){
                System.out.println("Name is invalid name. Try again!! ");
                    continue;
            }else
                break;
        }
            String studentNumber;
            while (true){
            System.out.print("Enter 10 digits Identification Number for student " + studentIndex + ": ");
            studentNumber = input.nextLine().trim();
                
                    if(studentNumber.isEmpty() || !studentNumber.matches("\\d{10}")){
                        System.out.println("Invalid entry. Try again!!");
                            continue;                    
                    }else
                        break;
            }
            Student student = new Student(studentName, studentNumber);
         String subjectName;  
         for(int subjectIndex = 1; subjectIndex <= numberOfSubjects; subjectIndex++){

            while(true){
             System.out.print("Enter subject " + subjectIndex + " name: ");
                subjectName = input.nextLine().trim();
                if(subjectName.isEmpty() || subjectName.matches(".*\\d.*")){
                    System.out.println("Invalid entry. Try again");
                        continue;
                }else
                    break;
            }
                
                int score;
                while(true){   
                System.out.print("Enter score in " + subjectName + ": ");
                    String scoreString = input.nextLine().trim();
            
                try{
                     score = Integer.parseInt(scoreString); 
                        if(score < 0 || score > 100){
                            System.out.println("Score cannot be less than 0 or greater that 100, Try again!!");
                                continue;
                        }else
                            break;               
                    }catch(NumberFormatException e){
                        System.out.print("Enter a valid whole number");
                    }// closing catch
                }// while closed
                
                student.addSubject(new Subject(subjectName, score));
            }//inner loop
            
            students.add(student);
        }// outer loop
    }//collect data
    public void displaySummary(){
        System.out.println("\n====== CLASS SUMMARY =====");   
        
    for(Student student : students){    
        System.out.println("\nStudent: " + student.getName());
        
        for(Subject subject : student.getSubjects()){
            System.out.println(subject.getName() + ": " + subject.getScore()            
            );
        }
        
        System.out.println("Total: " + student.getTotalScore());
        System.out.println("Average: " + student.getAverageScore());
    } 
    
    }
}//class closed
