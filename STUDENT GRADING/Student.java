import java.util.ArrayList;
public class Student{
    private String name;
    private String grade;
    private String courses;

    private ArrayList<Courses> courses;
    
    public Student(String name, String grade, String courses){
    this.name = name;
    this.grade = grade;
    this.courses = courses;
    
    courses = new ArrayList<Courses>();

    }
    
    public void setName(String name){
    this.name = name;
    }
    
    public String getName(){
    return name;
    }
    
    public void setGrade(String grade){
    this.grade = grade;
    }
    
    public String getGrade(){
    return grade;
    }

    public void setCourses(ArrayList courses){
    this.courses = courses;
    }
    
    public ArrayList<Courses> getCourses(){
    return courses;
    }
    
    public void addCourse(ArrayList courses){
    courses.add(courses);
    }
    
    public void removeCourse(ArrayList courses){
    courses.remove(courses);
    }

    public ArrayList<Courses> getStudentCourses(){
    return courses;    
    }
    

}
