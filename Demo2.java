class Human{
    private int age; 
    private String name;

    public Human(){
    
    age = 12;
    name = "Tobig";  
      
    }

    public int getAge(){
    
    return age;    
    }

    public void setAge(int age){
    
    this.age = age;
    }

    public String getName(){
    
    return name;    
    }

    public void setName(String name){
    
    this.name = name;
    }
    
}

public class Demo2{
    public static void main(String[]args){
    
    
    Human obj = new Human();
    Human obj1 = new Human();    
    obj.setAge(5);
    obj.setName("Tobi");

//    obj.age = 11;
//    obj.name = "Tobi";
    

    System.out.println(obj.getName() + " : " + obj.getAge());
    System.out.println(obj1.getName()+ " : " + obj1.getAge());
  
    }
}
