public class Rectangle{
    private int width;
    private int height;
    
    public Rectangle(int width, int height){
    this.width = width;
    this.height = height;    
    }

    public void setWidth(int width){
    this.width = width;    
    }
    
    public int getWidth(){
    return width;    
    }

    public void setHeight(int height){
    this.height = height;
    }
    
    public int getHeight(){
    return height;    
    }
    public int getArea(){
    return width * height;    
    }
}

public class Demo4{
    public static void main(String[]args){
    Rectangle shape = new Rectangle(5, 9);

    shape.setWidth(10);
    shape.setHeight(10);
    
    int result = shape.getArea();
    
    System.out.println(result);
    }

}
