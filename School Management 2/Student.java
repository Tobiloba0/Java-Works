import java.util.ArrayList;
public class Student{
    private String name;
    private String studentNumber;
    private ArrayList <Subject> subjects;
    
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
        
        this.subjects = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;    
    }
    
    public String getStudentNumber(){
        return studentNumber;    
    }
    
    public void setStudentNumber(){
        this.studentNumber = studentNumber;    
    }

    public void addSubject(Subject subject){
        subjects.add(subject);    
    }
    
    public void removeSubject(Subject subject){
        subjects.remove(subject);    
    }
    //finding subject by subject name
    public int getScoreForSubject(String subjectName){
        for(Subject subject : subjects){
            if(subject.getName().equals(subjectName)){
                return subject.getScore();
            }
        }
        return -1;
    }
    
    public int getTotalScore(){
        int total = 0;
        for(Subject subject : subjects){
            total+= subject.getScore();
        }
        return total;   
    }
    
    public double getAverageScore(){
        if(subjects.size() == 0) return 0;
        return (double)getTotalScore() / subjects.size();    
    }
    
    public ArrayList<Subject> getSubjects(){
        return subjects;    
    }
    
}
