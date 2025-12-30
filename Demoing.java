class Student{
    int rollno;
    String name;
    int marks;

}
public class Demo{
    public static void main(String[]args)
    {
        int nums [][] = new int[3][];
        
        nums[0] = new int[3]; 
        nums[1] = new int[4];
        nums[2] = new int[2];  


        for(int row = 0; row < nums.length; row++){
            for(int column = 0; column < nums[row].length; column++){
                nums[row][column] = (int)(Math.random() * 10);
                            
            }
           
        }

        for(int ns[] : nums){
            for(int m : ns){
            System.out.print(m + " ");
            }     
        System.out.println();
        }
   
     
    }

}
