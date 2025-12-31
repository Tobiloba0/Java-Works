import java.util.Scanner;
import java.util.ArrayList;
public class School{
    private ArrayList <Student> students;
    private ArrayList <Teacher> teachers;
    private ArrayList <ClassRoom> classRooms;
    
    public School(){
        this.students = new ArrayList<Student>();
        this.teachers = new ArrayList<Teacher>();
        this.classRooms = new ArrayList<ClassRoom>();
    }

    public void addStudent(Student student){
        students.add(student);   
    }
    
    public void removeStudent(Student student){
        students.remove(student);   
    }
    
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);    
    }
    
    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);   
    }
    
    public void addClass(ClassRoom classRoom){
        classRooms.add(classRoom);
    }

    public void removeClass(ClassRoom classRoom){
        classRooms.remove(classRoom);
    }
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }
    
    public ArrayList<ClassRoom> getClasses(){
        return classRooms;    
    }
    
    public void start(){ 
        Scanner input = new Scanner(System.in);
        System.out.println("""
        Welcome to Lagbaja School Model Management Center.
        
        How many students do you have.
        """);
        int numberOfStudents = input.nextInt();
        input.nextLine();
        
        for(int index = 1; index <= numberOfStudents; index++){
            System.out.println("Enter name of student " + index + ": ");
                String name = input.nextLine();
            System.out.println("Enter age of student " + index + ": ");
                int age = input.nextInt();
            System.out.println("Enter class of student " + index + ": ");
                input.nextLine();
                String classroom = input.nextLine();
            
            Student student = new Student(name, age, classroom);
        
            students.add(student);
 
        }
            System.out.println(student.toString());
        

        
    }
    
}
