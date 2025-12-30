public class Circle{
    private int radius;

    public Circle(int radius){
    this.radius = radius;
    }   

    public int getRadius(){
    return radius;
    }

    public void setRadius(int radius){
    this.radius = radius;
    }    
     
    public int getArea(){
    return (int)(Math.PI * (radius * radius));    
    }
    public int getCircumferance(){
    return (int)(2 * Math.PI * radius);    
    }
}

public class Demo5{
    public static void main(String[]args){
    Circle shape = new Circle(7);

    
    int result = shape.getArea();
    int result2 = shape.getCircumferance();
    
    System.out.println(result);
    System.out.println(result2);
    }

}
