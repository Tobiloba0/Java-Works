import java.util.Scanner;
import java.util.ArrayList;
public class Shopping{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    ArrayList<String> items = new ArrayList<>();
    ArrayList<Double> items = new ArrayList<>();

    }

    public static String addItem(){
    
        while(true){
        System.out.print("Enter name of product or press done to quit: ");
        String item = input.nextLine().trim();
            if(item.equalsIgnoreCase("done")){
               break;
            }

            if(item.isEmpty()){
            System.out.println("Item cannot be empty, please try again");
            continue; 
            }
           
        }/whileclosed

        //add price

        double price;

        while(true){
        System.out.println("Enter price of item");
        String stringPrice = input.nextLine().trim();
        
        try{
        price = Double.parseDouble(stringPrice);

            if(price < 0){
                System.out.print("Price cannot be a negative value. Try again ");
            continue;
            }//price if closed
            break;


        }//try closed
        catch(NumberFormarException e){
            System.out.println("Invalid price, Please enter a valid price!!");
        
        }//catch closed

        
        }//2nd while

        items.add(item);
        prices.add(price);
     System.out.println("Product and its price added successfully.");
  
    }//addItem closed
    
    public static printReceipt(ArrayList<String>items,          ArrayList<Double>prices, double total, double balance){

    System.out.println("\n---------PAYMENT RECEIPT---------");
    System.out.printf("%-15s %15s%n", "Item", "Price(₦)");
    System.out.println("-------------------------------");

    for(int index = 0; index < items.size(); index++){
        System.out.printf("%-15s %15.2f%n", items.get(index), prices.get(index));
    
    }
    System.out.println("-------------------------------");

    System.out.printf("%-15s %15d%n", "Total Paid:", paymentAmount);
    System.out.printf("%-15s %15.2f%n", "Grand Total:", total);
    System.out.printf("%-15s %15.2f%n", "Balance:", balance);

    System.out.println("Payment successful! Thank you for shopping.");

    
        
    }//print receipt method closed

    public static printInvoice(){}

}
