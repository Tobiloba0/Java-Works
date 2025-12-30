
public class Employee{
    private String name;
    private String title;
    private double salary;
    
    public Employee(String name, String title, double salary){
    this.name = name;
    this.title = title;
    this.salary = salary;    
    }

    public void setName(String name){
    this.name = name;    
    }
    
    public String getName(){
    return name;    
    }

    public void setTitle(String title){
    this.title = title;    
    }
    
    public String getTitle(){
    return title;    
    }

    public void setSalary(double salary){
    this.salary = salary;    
    }
    
    public double getSalary(){
    return salary;    
    }

    public void updateSalary(double percent){
    salary = salary + salary * percent / 100;
    
    }

    //printing employee details

    public void printEmployeeDetails(){
        System.out.println("Name" + name);    
        System.out.println("JobTitle" + title);    
        System.out.println("Salary" + salary);    
    }
}

public class Demo7{
    public static void main(String[]args){
    
    Employee employee1 = new Employee("Tobi", "Manager", 5000.0);
    Employee employee2 = new Employee("Andrea", "Software Engineer", 60000.0);

    employee1.printEmployeeDetails();
    employee2.printEmployeeDetails();

    employee1.updateSalary(5);
    employee2.updateSalary(6);

    employee1.printEmployeeDetails();
    employee2.printEmployeeDetails();
    
    

        
        
    }
}
